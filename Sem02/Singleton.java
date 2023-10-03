//2023/10/03
package Sem02;

public class Singleton{
    private static Singleton instance;

    private Singleton(){
    }
    public static Singleton getInstance(){
        if(instance == null) instance = new Singleton();
        return instance;
    }

    public static void main(String[] args){
        Singleton obj1 = getInstance();
        Singleton obj2 = getInstance();

        if(obj1.equals(obj2)){System.out.println("obj1 equals obj2, \nlinks are:\n" + obj1 + " and "+ obj2);}
    }
}

