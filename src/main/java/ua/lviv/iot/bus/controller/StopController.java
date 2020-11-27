package ua.lviv.iot.bus.controller;

import ua.lviv.iot.bus.model.entity.Stop;
import ua.lviv.iot.bus.service.StopService;

public class StopController extends AbstractController<Stop,Integer,StopService> {
    public StopController() {    
      super(StopService.class);
    }
}
