package ua.lviv.iot.bus.DAO;

import ua.lviv.iot.bus.model.entity.Route;

public class RouteDAO extends BaseDAO<Route,Integer>{
  public RouteDAO() {
    super(Route.class);
  }
}