package ua.lviv.iot.bus.controller;

import ua.lviv.iot.bus.model.entity.DistanceBetweenStops;
import ua.lviv.iot.bus.service.DistanceBetweenStopsService;

public class DistanceBetweenStopsController extends AbstractController<DistanceBetweenStops,Integer,DistanceBetweenStopsService>{
  public DistanceBetweenStopsController() {
    super(DistanceBetweenStopsService.class);
  }
}