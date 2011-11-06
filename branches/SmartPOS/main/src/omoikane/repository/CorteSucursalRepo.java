package omoikane.repository;

import omoikane.entities.CorteSucursal;
import org.synyx.hades.dao.GenericDao;
import org.synyx.hades.dao.Modifying;
import org.synyx.hades.dao.Query;

/**
 * Created by IntelliJ IDEA.
 * User: octavioruizcastillo
 * Date: 19/07/11
 * Time: 15:32
 * To change this template use File | Settings | File Templates.
 */

public interface CorteSucursalRepo extends GenericDao<CorteSucursal, Long> {
    CorteSucursal save(CorteSucursal corte);

    @Modifying
    @Query("UPDATE CorteSucursal SET abierto = 0 WHERE id = LAST_INSERT_ID()")
    void cerrarSucursal();

    @Query("SELECT abierto FROM CorteSucursal WHERE id = LAST_INSERT_ID()")
    Boolean isSucusalAbierta();

    @Query("SELECT cs FROM CorteSucursal cs WHERE id = LAST_INSERT_ID()")
    CorteSucursal getLastCorteSucursal();

}
