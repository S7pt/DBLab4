package ua.lviv.iot.bus.model.entity;

import ua.lviv.iot.bus.model.annotation.Column;
import ua.lviv.iot.bus.model.annotation.PrimaryKey;
import ua.lviv.iot.bus.model.annotation.Table;

@Table(name = "route")
public class Route {
  
  @PrimaryKey
  @Column(name = "id")
  private Integer id;
  
  @Column(name="starting_address",length=45)
  private String startingAddress;
  
  @Column(name="destination",length=45)
  private String destination;
  
  @Column(name="route_number",length=10)
  private String routeNumber;
  
  public Route(int id, String startingAddress, String destination, String routeNumber) {
    this.id = id;
    this.startingAddress = startingAddress;
    this.destination = destination;
    this.routeNumber = routeNumber;
  }

  public Route(String startingAddress, String destination, String routeNumber) {
    this.startingAddress = startingAddress;
    this.destination = destination;
    this.routeNumber = routeNumber;
  }
  public Route() {
    
  }
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getStartingAddress() {
    return startingAddress;
  }

  public void setStartingAddress(String startingAddress) {
    this.startingAddress = startingAddress;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public String getRouteNumber() {
    return routeNumber;
  }

  public void setRouteNumber(String routeNumber) {
    this.routeNumber = routeNumber;
  }


  @Override
  public String toString() {
    return "\nRoute [id=" + id + ", startingAddress=" + startingAddress + ", destination=" + destination
        + ", routeNumber=" + routeNumber + "]";
  }
  
  
}
