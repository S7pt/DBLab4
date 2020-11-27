package ua.lviv.iot.bus.DAO;

import ua.lviv.iot.bus.model.entity.BusModel;

public class BusModelDAO extends BaseDAO<BusModel,Integer>{
    public BusModelDAO() {
      super(BusModel.class);
    }
}
