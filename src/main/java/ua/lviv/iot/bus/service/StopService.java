package ua.lviv.iot.bus.service;

import ua.lviv.iot.bus.DAO.StopDAO;
import ua.lviv.iot.bus.model.entity.Stop;

public class StopService extends AbstractService<Stop,Integer,StopDAO>{
    public StopService() {
      super(StopDAO.class);
    }
}
