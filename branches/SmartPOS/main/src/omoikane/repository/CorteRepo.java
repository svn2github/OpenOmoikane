package omoikane.repository;

import omoikane.entities.Corte;
import omoikane.entities.CorteSucursal;
import org.synyx.hades.dao.GenericDao;
import org.synyx.hades.dao.Query;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: octavioruizcastillo
 * Date: 27/07/11
 * Time: 00:48
 * To change this template use File | Settings | File Templates.
 */
public interface CorteRepo extends GenericDao<Corte, Long> {

    @Query("SELECT corte.* FROM corte WHERE id = max(id) GROUP BY id_caja")
    List<Corte> findLastCortes();

}
