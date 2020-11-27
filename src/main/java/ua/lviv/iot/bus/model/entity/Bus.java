package ua.lviv.iot.bus.model.entity;

import ua.lviv.iot.bus.model.annotation.Column;
import ua.lviv.iot.bus.model.annotation.PrimaryKey;
import ua.lviv.iot.bus.model.annotation.Table;

@Table(name = "bus")
public class Bus {

  @PrimaryKey
  @Column(name = "id")
  private Integer id;

  @Column(name = "driver_id")
  private Integer driverId;

  @Column(name = "route_id")
  private Integer routeId;

  @Column(name = "bus_model_id")
  private Integer busModelId;

  @Column(name = "age")
  private Integer age;

  @Column(name = "mileage")
  private Integer mileage;

  public Bus(int id, int driverId, int routeId, int busModelId, int age, int mileage) {
    super();
    this.id = id;
    this.driverId = driverId;
    this.routeId = routeId;
    this.busModelId = busModelId;
    this.age = age;
    this.mileage = mileage;
  }

  public Bus(int driverId, int routeId, int busModelId, int age, int mileage) {
    super();
    this.driverId = driverId;
    this.routeId = routeId;
    this.busModelId = busModelId;
    this.age = age;
    this.mileage = mileage;
  }
  public Bus() {}

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getDriverId() {
    return driverId;
  }

  public void setDriverId(int driverId) {
    this.driverId = driverId;
  }

  public int getRouteId() {
    return routeId;
  }

  public void setRouteId(int routeId) {
    this.routeId = routeId;
  }

  public int getBusModelId() {
    return busModelId;
  }

  public void setBusModelId(int busModelId) {
    this.busModelId = busModelId;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getMileage() {
    return mileage;
  }

  public void setMileage(int mileage) {
    this.mileage = mileage;
  }

  @Override
  public String toString() {
    return "\nBus [id=" + id + ", driverId=" + driverId + ", routeId=" + routeId + ", busModelId=" + busModelId + ", age="
        + age + ", mileage=" + mileage + "]";
  }
  
}
