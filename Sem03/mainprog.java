package Sem03;

import java.util.ArrayList;
import java.util.List;

public class mainprog {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
     
        animals.add(new cat("Мурка", 2));
        animals.add(new cat("Барсик", 3));
        animals.add(new dog("Шарик", 4));
        animals.add(new dog("Бася", 5));
        animals.add(new popug("Попка", 1));
        animals.add(new popug("Кривляка", 1));        


        for(Animal animal: animals){
            System.out.println("-------------------");
            System.out.println(animal);
            animal.go();
            animal.eat();
            animal.voice();
        }
    }
}
