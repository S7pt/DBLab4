package ua.lviv.iot.bus.model.entity;

import ua.lviv.iot.bus.model.annotation.Column;
import ua.lviv.iot.bus.model.annotation.PrimaryKey;
import ua.lviv.iot.bus.model.annotation.Table;

@Table(name = "producer")
public class Producer {
  
  @PrimaryKey
  @Column(name = "id")
  private Integer id;
  
  @Column(name = "producer_name")
  private String producerName;

  public Producer(int id, String producerName) {
    this.id = id;
    this.producerName = producerName;
  }

  public Producer(String producerName) {
    this.producerName = producerName;
  }
  public Producer() {
  }
  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getProducerName() {
    return producerName;
  }

  public void setProducerName(String producerName) {
    this.producerName = producerName;
  }

  @Override
  public String toString() {
    return "\nProducer [id=" + id + ", producerName=" + producerName + "]";
  }

  
  
}
