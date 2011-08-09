package omoikane.repository;

import omoikane.entities.CorteSucursal;
import org.synyx.hades.dao.GenericDao;

/**
 * Created by IntelliJ IDEA.
 * User: octavioruizcastillo
 * Date: 19/07/11
 * Time: 15:32
 * To change this template use File | Settings | File Templates.
 */

public interface CorteSucursalRepo extends GenericDao<CorteSucursal, Long> {
    CorteSucursal save(CorteSucursal corte);
}
