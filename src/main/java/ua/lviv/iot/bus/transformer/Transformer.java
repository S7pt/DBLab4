package ua.lviv.iot.bus.transformer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import ua.lviv.iot.bus.model.annotation.Column;
import ua.lviv.iot.bus.model.annotation.Table;

public class Transformer<T> {

  private Class<T> chosenClass;

  public Transformer(Class<T> myClass) {
    this.chosenClass = myClass;
  }

  public Object transformToEntity(ResultSet rs) throws SQLException {
    Object entity = null;
    try {
      entity = chosenClass.getConstructor().newInstance();
      if (chosenClass.isAnnotationPresent(Table.class)) {
        for (Field field : chosenClass.getDeclaredFields()) {
          if (field.isAnnotationPresent(Column.class)) {
            field.setAccessible(true);
            Column column = (Column) field.getAnnotation(Column.class);
            String name = column.name();
            @SuppressWarnings("rawtypes")
            Class fieldType = field.getType();
            if (fieldType == Integer.class) {
              field.set(entity, rs.getInt(name));
            } else if (fieldType == String.class) {
              field.set(entity, rs.getString(name));
            }
          }
        }
      }
    } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
        | NoSuchMethodException | SecurityException e) {
      e.printStackTrace();
    }
    return entity;
  }
}
