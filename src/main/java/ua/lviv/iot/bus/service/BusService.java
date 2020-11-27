package ua.lviv.iot.bus.service;

import ua.lviv.iot.bus.DAO.BusDAO;
import ua.lviv.iot.bus.model.entity.Bus;

public class BusService extends AbstractService<Bus,Integer,BusDAO>{
    public BusService() {
      super(BusDAO.class);
    }
}
