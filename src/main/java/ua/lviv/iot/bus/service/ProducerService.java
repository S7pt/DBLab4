package ua.lviv.iot.bus.service;

import java.security.Provider.Service;

import ua.lviv.iot.bus.DAO.ProducerDAO;

public class ProducerService extends AbstractService<Service,Integer,ProducerDAO>{
   public ProducerService() {
     super(ProducerDAO.class);
   }
}
