package vn.edu.pxu.service;

import java.util.List;

public interface BaseService<T> {
    public List < T > getAll();

    public void save(T object);

    public T get(int id);

    public void delete(int id);

}
