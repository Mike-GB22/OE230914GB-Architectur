package Sem03;

interface canvoice {
    default void voice(){
        System.out.println("не переопределенный метод, подать голос");
    }
}
