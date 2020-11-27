package ua.lviv.iot.bus.service;

import ua.lviv.iot.bus.DAO.DistanceBetweenStopsDAO;
import ua.lviv.iot.bus.model.entity.DistanceBetweenStops;

public class DistanceBetweenStopsService extends AbstractService<DistanceBetweenStops,Integer,DistanceBetweenStopsDAO> {
    public DistanceBetweenStopsService() {
      super(DistanceBetweenStopsDAO.class);
    }
}
