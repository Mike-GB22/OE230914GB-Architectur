package Sem03;

interface caneat {
    default void eat(){
        System.out.println("не переопределенный методс, кушать");
    }
}
