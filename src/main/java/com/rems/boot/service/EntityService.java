package com.rems.boot.service;

public interface EntityService<T> {

    T add(T entity);

    void delete(T entity);

    void update(T entity);

    T get(T entity);

}
