package ua.lviv.iot.bus.controller;

import ua.lviv.iot.bus.model.entity.Bus;
import ua.lviv.iot.bus.service.BusService;

public class BusController extends AbstractController<Bus,Integer,BusService>{
  public BusController() {
    super(BusService.class);
  }
}
