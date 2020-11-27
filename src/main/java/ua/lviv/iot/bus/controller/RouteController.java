package ua.lviv.iot.bus.controller;

import ua.lviv.iot.bus.model.entity.Route;
import ua.lviv.iot.bus.service.RouteService;

public class RouteController extends AbstractController<Route,Integer,RouteService> {
    public RouteController() {
      super(RouteService.class);
    }
}
