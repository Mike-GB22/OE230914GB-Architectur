package Sem03;

abstract public class Animal implements caneat, canvoice, cango{
    String type;
    String subtype;
    String name;
    int age;

    public Animal(String type, String subtype, String name, int age){
        this.type = type;
        this.subtype = subtype;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("[%s из группы %s, по имени %s, возраст: %d]", subtype, type, name, age);
    }
}
