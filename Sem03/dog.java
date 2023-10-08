package Sem03;

public class dog extends mammal{

    public dog(String name, int age) {
        super("Собакен", name, age);
    }
    
    public void go(){
        System.out.println("Собакен " + this.name + " бежит");
    }

    public void eat(){
        System.out.println("Собакен " + this.name + " кушает");
    }

    public void voice(){
        System.out.println("Собакен " + this.name + " гавкает");
    }

}
