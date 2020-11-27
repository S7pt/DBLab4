package ua.lviv.iot.bus.service;

import ua.lviv.iot.bus.DAO.RouteDAO;
import ua.lviv.iot.bus.model.entity.Route;

public class RouteService extends AbstractService<Route,Integer,RouteDAO>{
    public RouteService() {
      super(RouteDAO.class);
    }
}
