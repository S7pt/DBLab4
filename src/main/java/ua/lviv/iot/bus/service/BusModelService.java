package ua.lviv.iot.bus.service;

import ua.lviv.iot.bus.DAO.BusModelDAO;
import ua.lviv.iot.bus.model.entity.BusModel;

public class BusModelService extends AbstractService<BusModel,Integer,BusModelDAO>{
   public BusModelService() {
     super(BusModelDAO.class);
   }
}
