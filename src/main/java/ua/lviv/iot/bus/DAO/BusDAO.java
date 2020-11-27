package ua.lviv.iot.bus.DAO;

import ua.lviv.iot.bus.model.entity.Bus;

public class BusDAO extends BaseDAO<Bus,Integer> {
  public BusDAO() {
      super(Bus.class);
  }
}
