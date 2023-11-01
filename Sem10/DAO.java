package Sem10;

import java.util.List;

public interface DAO <T> {
    T findById(int id);
    List<T> findAll();
    void add(T t);
    void save(T newT);
    void delete(int id);
}
