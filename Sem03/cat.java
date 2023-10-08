package Sem03;

public class cat extends mammal{

    public cat(String name, int age) {
        super("Кошкен", name, age);
    }
    
    public void go(){
        System.out.println("Кошкен " + this.name + " тыгыдычит");
    }

    public void eat(){
        System.out.println("Кошкен " + this.name + " кушает");
    }

    public void voice(){
        System.out.println("Кошкен " + this.name + " мяукает");
    }

}
