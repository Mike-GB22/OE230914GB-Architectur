package Sem10;

import java.util.List;

public interface Repository <T>{
    T getById(int id);
    List<T> getAll();
    void add(T t);
    void update(T newT);
    void delete(int id);
}   

