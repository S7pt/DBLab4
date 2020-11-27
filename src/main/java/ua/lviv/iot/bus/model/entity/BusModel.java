package ua.lviv.iot.bus.model.entity;

import ua.lviv.iot.bus.model.annotation.Column;
import ua.lviv.iot.bus.model.annotation.PrimaryKey;
import ua.lviv.iot.bus.model.annotation.Table;

@Table(name = "bus_model")
public class BusModel {

  @PrimaryKey
  @Column(name = "id")
  private Integer id;
  
  @Column(name="producer_id")
  private Integer producerId;
  
  @Column(name="color",length=12)
  private String color;
  
  @Column(name="capacity")
  private Integer capacity;
  
  @Column(name="model_name",length=45)
  private String modelName;

  public BusModel(int id, int producerId, String color, int capacity, String modelName) {
    this.id = id;
    this.producerId = producerId;
    this.color = color;
    this.capacity = capacity;
    this.modelName = modelName;
  }

  public BusModel(int producerId, String color, int capacity, String modelName) {
    this.producerId = producerId;
    this.color = color;
    this.capacity = capacity;
    this.modelName = modelName;
  }
  
  
  public BusModel() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getProducerId() {
    return producerId;
  }

  public void setProducerId(int producerId) {
    this.producerId = producerId;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  @Override
  public String toString() {
    return "\nBusModel [id=" + id + ", producerId=" + producerId + ", color=" + color + ", capacity=" + capacity
        + ", modelName=" + modelName + "]";
  }
  
}
