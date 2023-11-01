package Sem10;

public class Product {
    public static int count = 0;
    public int id;
    public String name;
    public int price;

    public Product(String name){
        this(++count, name, 100);
    }

    public Product(String name, int price){
        this(++count, name, price);
    }

    public Product(int id, String name, int price){
        this.name = name;
        this.price = price;
        if (id < 1) {id = ++count;}
        this.id = id;
    }    

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
        return;
    }

    @Override
    public String toString(){
        return "["+id+"] "+ name +", $"+price;
    }
}


