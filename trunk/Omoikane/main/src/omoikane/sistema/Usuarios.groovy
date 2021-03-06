 /* Author Phesus        //////////////////////////////
 *  ORC,ACR             /////////////
 *                     /////////////
 *                    /////////////
 *                   /////////////
 * //////////////////////////////                   */
 //iiiiiiiiiiiiiiiiiiiiiiiiiiiiii
 //iiiiiiiiiiiiiiiiiiiiiiiiiiiiii
 //iiiiiiiiiiiiiiiiiiiiiiiiiiiiii
 //iiiiiiiiiiiiiiiiiiiiiiiiiiiiii

package omoikane.sistema;


 import omoikane.principal.*

 import omoikane.repository.UsuarioRepo
 import org.apache.log4j.Logger

 import omoikane.entities.Usuario
 import org.springframework.beans.factory.annotation.Autowired
 import org.springframework.stereotype.Service

 import omoikane.sistema.huellas.MiniLeerHuella

 @Service
 public class Usuarios {


    @Autowired
    UsuarioRepo usuarioRepo;

    public Long getUserCount() {
        return usuarioRepo.countIt();
    }

    //public Usuario usrActivo = new Usuario();
    private static boolean autorizado = false;
    public static def usuarioActivo             = [:]
    public static def ultimoUsuarioIdentificado = [:]
    public static def CAJERO        = 0
    public static def CAPTURISTA    = 0.5
    public static def SUPERVISOR    = 1
    public static def GERENTE       = 2
    public static def ADMINISTRADOR = 3
    public static def PROPIETARIO   = 4
    public static Logger logger        = Logger.getLogger(Usuarios.class);

    public static def login() throws Exception {
        usuarioActivo = identificaPersona()
        usuarioActivo
    }
    public static def logout() {
        usuarioActivo = null
    }
    public static int getIDUsuarioActivo() {
        return usuarioActivo.ID;
    }
    public static int getIDUltimoAutorizado() {
        return ultimoUsuarioIdentificado.ID;
    }
    public static int setIDUsuarioActivo(Integer id) {
        if(usuarioActivo==null) {
            usuarioActivo = [ID: id, huella: "", nombre: "", sucursales: null];
        } else {
            usuarioActivo.ID = id;
        }
    }
    public static def identificaPersona() throws Exception {
            def escritorio   = omoikane.principal.Principal?.escritorio?.getFrameEscritorio()
            def respuesta
            MiniLeerHuella fingerPrint
            Usuarios sysUsers = omoikane.principal.Principal.applicationContext.getBean(Usuarios.class);

            if(Principal.ASEGURADO && sysUsers.getUserCount() > 0) {
                while(true) {
                    fingerPrint  = new omoikane.formularios.WndLeerHuella(escritorio).getMiniLeerHuella()
                    if (fingerPrint.verifyFeatureSet != null && fingerPrint.verifyFeatureSet.length > 0) { break; }
                }

                def serv          = Nadesico.conectar()
                //Aquí sucede la identificación del usuario
                Usuario usuario = fingerPrint.identify();

                if(usuario == null) {
                    respuesta = 0;
                } else {
                    def nadesicoUsuario = serv.getUsuario(usuario.getId(),1);
                    respuesta = [ID: usuario.getId(), huella: "", nombre: usuario.getNombre(), sucursales:["1":nadesicoUsuario.perfil]]
                }
                serv.desconectar()

            } else {
                respuesta = [ID:1,huella:"",nombre:"Instalador",sucursales:["1":4]]
            }

            /* Intento de pasar la DAL y parte de la BL a Omoikane
            Usuarios userSystem   = (Usuarios) Principal.getContext().getBean("usuarios");

            if(Principal.ASEGURADO) {
                respuesta    = userSystem.checkFingerPrint(fingerPrint)
            } else {
                respuesta = [ID:20,huella:"",nombre:"Pruebas",sucursales:["1":4]]
            }
            */

            if(respuesta != 0) {
                respuesta.cerrojo= { llave ->
                  return llave<=respuesta.sucursales[Principal.IDAlmacen as String]
                }
                ultimoUsuarioIdentificado = respuesta
            } else {
                respuesta = [:]
                respuesta.cerrojo= { return false; }
            }

            respuesta
    }
     //** Esta función sirve para dar un acceso especial a un usuario, por ejemplo para cancelaciones

    public static boolean autentifica(llave) {
        return identificaPersona().cerrojo(llave) as boolean
    }

    public static boolean cerrojo(llave) {
        return usuarioActivo.cerrojo(llave) as boolean
    }

    public static MiniLeerHuella leerHuella(){
        def escritorio   = omoikane.principal.Principal.escritorio.getFrameEscritorio()
        def fingerPrint  = new omoikane.formularios.WndLeerHuella(escritorio).getMiniLeerHuella()
        return fingerPrint
    }

    /* Intento de pasar la DAL y parte de la BL a Omoikane
    public def checkFingerPrint(fingerP ) {
        try {
            Template        ref1, ref2;
            ref1            = new Template();
            ref2            = new Template();
            MatchingContext checador = null;
            def autorizado  = false, respuesta = null

            try {
                checador = new MatchingContext();
                ref1.setData(fingerP);

            } catch(Exception grje) {
                logger.error(Level.SEVERE, "Error al convertir hex a bytes", grje);
                grje.printStackTrace();
                throw grje
            }

            def data = [:], usr_suc, mC = null

            try {
                    def usuarios = usuarioRepo.findAll();
                    try {
                        for(Usuario usuario : usuarios)
                        {
                            data['ID']       = usuario.id;
                            data['nombre']   = usuario.nombre;

                            mC = new MatchingContext()
                            ref2.setData(usuario.huella1);
                            if(ref2!=null)  {autorizado = (mC.identify(ref1, ref2));
                            if(!autorizado) {ref2.setData(usuario.huella2);  autorizado = (mC.identify(ref1, ref2)); }
                            if(!autorizado) {ref2.setData(usuario.huella3);  autorizado = (mC.identify(ref1, ref2)); }
                            }
                            if(mC != null)
                            {
                                mC.destroy();
                            }
                            if(autorizado) {
                                autorizado = data;
                                throw new Exception("BREAK")
                            }
                        }
                    } catch(Exception ex)  {
                        if(ex.message != "BREAK") {
                            logger.error("Error al autenticar: ${ex.message}", ex);
                        }
                    }

                    respuesta = (autorizado)?data:0
                    return respuesta

            } catch(Exception exc) {
                logger.error("Error al autenticar: ${exc.message}", exc)
                throw exc
            }
        } catch(e) {
          logger.error("Error al identificar usuario", e);
          throw e
        }
    }
    */
}