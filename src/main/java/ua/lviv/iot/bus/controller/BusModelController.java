package ua.lviv.iot.bus.controller;

import ua.lviv.iot.bus.model.entity.BusModel;
import ua.lviv.iot.bus.service.BusModelService;

public class BusModelController extends AbstractController<BusModel,Integer,BusModelService>{
  public BusModelController() {
    super(BusModelService.class);
}}