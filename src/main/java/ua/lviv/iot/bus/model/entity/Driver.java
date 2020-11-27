package ua.lviv.iot.bus.model.entity;

import ua.lviv.iot.bus.model.annotation.Column;
import ua.lviv.iot.bus.model.annotation.PrimaryKey;
import ua.lviv.iot.bus.model.annotation.Table;

@Table(name = "driver")
public class Driver {
  @PrimaryKey
  @Column(name = "id")
  private Integer id;

  @Column(name = "name", length = 40)
  private String name;

  @Column(name = "surname", length = 30)
  private String surname;

  public Driver(int id, String name, String surname) {
    this.id = id;
    this.name = name;
    this.surname = surname;
  }

  public Driver(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }
  public Driver() {}
  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  @Override
  public String toString() {
    return "\nDriver [id=" + id + ", name=" + name + ", surname=" + surname + "]";
  }
  
  
}
