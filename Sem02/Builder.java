package Sem02;

public class Builder {
    private int size;
    private int count;
    private String color;

    public Builder setSize(int size){
        this.size = size;
        return this;
    }
    public Builder setColor(String color){
        this.color = color;
        return this;
    }
    public Builder setCount(int count){
        this.count = count;
        return this;
    }    
    public Obj build(){
        Obj newObj = new Obj();
        newObj.size = this.size;
        newObj.color = this.color;
        newObj.count = this.count;
        return newObj;
    }

    public static void main(String[] args) {
        Obj realisation = new Builder().setSize(10).setCount(20).setColor("White").build();
        System.out.println(realisation);
    }
}

class Obj{
    int size;
    int count;
    String color;

    public String toString(){
        return String.format("We have obj! Color = %s, Count = %d, Size = %d", color, count, size);
    }
}
