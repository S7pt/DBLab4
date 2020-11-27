package ua.lviv.iot.bus.service;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import ua.lviv.iot.bus.DAO.DAOInterface;

public abstract class AbstractService<T,ID,DAO> implements ServiceTemplate<T,ID> {
    private DAOInterface<T,ID> dataAccessObject;
    @SuppressWarnings({ "unchecked", "deprecation" })
    public AbstractService(Class<DAO> currentClass) {
        try {
            dataAccessObject = (DAOInterface<T, ID>) currentClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public List<T> getAll() throws SQLException {
        return dataAccessObject.getAll();
    }

    @Override
    public T getBy(ID id) throws SQLException {
        return dataAccessObject.getBy(id);
    }

    @Override
    public int delete(ID id) throws SQLException {
        return dataAccessObject.delete(id);
    }

    @Override
    public int update(T entity) throws SQLException {
        return dataAccessObject.update(entity);
    }

    @Override
    public int create(T entity) throws SQLException {
        return dataAccessObject.create(entity);
    }

}
