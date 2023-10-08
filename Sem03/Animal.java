package Sem03;

abstract public class Animal implements caneat, canvoice, cango{
    public String type;
    public String subtype;
    public String name;
    public int age;

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
