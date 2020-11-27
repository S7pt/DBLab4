package ua.lviv.iot.bus.DAO;

import ua.lviv.iot.bus.model.entity.Driver;

public class DriverDAO extends BaseDAO<Driver,Integer>{
   public DriverDAO() {
     super(Driver.class);
   }
}
