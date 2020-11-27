package ua.lviv.iot.bus.service;

import ua.lviv.iot.bus.DAO.DriverDAO;
import ua.lviv.iot.bus.model.entity.Driver;

public class DriverService extends AbstractService<Driver,Integer,DriverDAO>{
    public DriverService() {
      super(DriverDAO.class);
    }
}
