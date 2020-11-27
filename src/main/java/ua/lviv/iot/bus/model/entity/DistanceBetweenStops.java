package ua.lviv.iot.bus.model.entity;

import ua.lviv.iot.bus.model.annotation.Column;
import ua.lviv.iot.bus.model.annotation.PrimaryKey;
import ua.lviv.iot.bus.model.annotation.Table;

@Table(name="distance_between_stops")
public class DistanceBetweenStops {
  @PrimaryKey
  @Column(name="id")
  private Integer id;
  @Column(name="start_id")
  private Integer startId;
  @Column(name="finish_id")
  private Integer finishId;
  @Column(name="distance")
  private Integer distance;
  
  public DistanceBetweenStops(Integer id, Integer startId, Integer finishId, Integer distance) {
    this.id = id;
    this.startId = startId;
    this.finishId = finishId;
    this.distance = distance;
  }
  
  public DistanceBetweenStops(Integer startId, Integer finishId, Integer distance) {
    this.startId = startId;
    this.finishId = finishId;
    this.distance = distance;
  }

  public DistanceBetweenStops() {
    
  }
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getStartId() {
    return startId;
  }

  public void setStartId(int startId) {
    this.startId = startId;
  }

  public int getFinishId() {
    return finishId;
  }

  public void setFinishId(int finishId) {
    this.finishId = finishId;
  }

  @Override
  public String toString() {
    return "\nDistanceBetweenStops [id=" + id + ", startId=" + startId + ", finishId=" + finishId + ", distance="
        + distance + "]";
  }

}
