//2023/10/03
package Sem02;

public class Factory {
    public Speakeble getAnimal(String sortOfAnimal){
        if(sortOfAnimal.equalsIgnoreCase("котёнок")) return (Speakeble) new katzchen();
        if(sortOfAnimal.equalsIgnoreCase("щенок")) return (Speakeble) new hundchen();
        if(sortOfAnimal.equalsIgnoreCase("птичка")) return (Speakeble) new vogelchen();        
        return null;
    }

    public static void main(String[] args){
        Factory factory = new Factory();
        Speakeble cat = factory.getAnimal("котёнок");
        Speakeble dog = factory.getAnimal("щенок");
        Speakeble bird = factory.getAnimal("птичка");

        cat.voice();
        dog.voice();
        bird.voice();
    }
}

interface Speakeble{
    default void voice(){
        System.out.println("комманда голос, не переопредленна");
    }
}

class katzchen implements Speakeble{
    public void voice(){
        System.out.println("мяу-мяу");
    }
}

class hundchen implements Speakeble{
    public void voice(){
        System.out.println("тяф-тяф");
    }
}

class vogelchen implements Speakeble{
    public void voice(){
        System.out.println("чик-чирик");
    }
}

