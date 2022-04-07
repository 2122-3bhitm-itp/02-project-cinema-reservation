package at.htl.cinemareservation.controller;

import java.util.List;

public interface Persistent<T> {

    public void save(T entity);
    public void insert(T entity);
    public void delete(long id);
    public List<T> findAll();
    public T findById(long id);
}
