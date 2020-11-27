package ua.lviv.iot.bus.DAO;

import ua.lviv.iot.bus.model.entity.Stop;

public class StopDAO extends BaseDAO<Stop,Integer>{
    public StopDAO(){
      super(Stop.class);
    }
}
