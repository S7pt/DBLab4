package ua.lviv.iot.bus.controller;

import ua.lviv.iot.bus.model.entity.Driver;
import ua.lviv.iot.bus.service.DriverService;

public class DriverController extends AbstractController<Driver,Integer,DriverService>{
    public DriverController() {
      super(DriverService.class);
    }
}
