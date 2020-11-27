package ua.lviv.iot.bus.controller;

import ua.lviv.iot.bus.model.entity.Producer;
import ua.lviv.iot.bus.service.ProducerService;

public class ProducerController extends AbstractController<Producer,Integer,ProducerService>{
    public ProducerController() {
      super(ProducerService.class);
    }
}
