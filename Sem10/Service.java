package Sem10;

import java.util.List;

interface Service <T>{
    T getByIdWithLogic(int id);
    List<T> getAllWithLogic();
    void addWithLogic(T t);
    void updateWithLogic(T newT);
    void deleteWithLogic(int id);
}   

