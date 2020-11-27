package ua.lviv.iot.bus.DAO;

import ua.lviv.iot.bus.model.entity.DistanceBetweenStops;

public class DistanceBetweenStopsDAO extends BaseDAO<DistanceBetweenStops,Integer> {
    public DistanceBetweenStopsDAO(){
      super(DistanceBetweenStops.class);
    }
}
