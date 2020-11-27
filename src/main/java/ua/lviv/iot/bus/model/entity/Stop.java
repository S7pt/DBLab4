package ua.lviv.iot.bus.model.entity;

import ua.lviv.iot.bus.model.annotation.Column;
import ua.lviv.iot.bus.model.annotation.PrimaryKey;
import ua.lviv.iot.bus.model.annotation.Table;

@Table(name="stop")
public class Stop {
  
  @PrimaryKey
  @Column(name="id")
  private Integer id;
  
  @Column(name="address")
  private String address;

  public Stop(int id, String address) {
    this.id = id;
    this.address = address;
  }

  public Stop(String address) {
    this.address = address;
  }
  
  public Stop() {   
  }
  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "\nStop [id=" + id + ", address=" + address + "]";
  }
  
}
