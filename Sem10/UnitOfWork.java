package Sem10;

import java.util.List;

interface UnitOfWork <T>{

    void add(T t);
    void delete(T t);
    void commint();
    void cancel();
    List<T> getAll();
    T getById(int id);
    void update(T newT);
}
