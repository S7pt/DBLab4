package ua.lviv.iot.bus.DAO;

import ua.lviv.iot.bus.model.entity.Producer;

public class ProducerDAO extends BaseDAO<Producer,Integer>{
    public ProducerDAO() {
      super(Producer.class);
    }
}
