package Sem03;

abstract public class birds extends Animal {

    public birds(String subtype, String name, int age){
        super("Птички", subtype, name, age);
    }

    public void go(){
        System.out.println("Птица " + this.name + " летит");
    }

    public void eat(){
        System.out.println("Птица " + this.name + " кушает/клюет");
    }

    public void voice(){
        System.out.println("Птица " + this.name + " чирикает");
    }
}
