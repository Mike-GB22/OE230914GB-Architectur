//2023.11.01 
package Sem10;

public class Main {
    public static void main(String[] args) {
        UnitOfWork<Product> uow = new ProductUnitOfWork();

        uow.add(new Product("Кастрюля"));
        uow.add(new Product("Скороводка", 1000));
        uow.add(new Product("Скороводка большая", 2000));
        uow.commint();

        System.out.println("---Добавили и вызвали коммит--------------");
        System.out.println(uow.getAll());
        System.out.println();

        uow.add(new Product("Кастрюля маленькая"));
        uow.add(new Product("Скороводка маленькая", 1000));

        Product productToDel = new Product("Товар для удаления", 1200);
        uow.add(productToDel);

        Product productToMod = new Product("Товар для модификации", 1000000);
        uow.add(productToMod);

        System.out.println("---Добавили и НЕ вызвали коммит--------------");
        System.out.println(uow.getAll());
        System.out.println();

        uow.commint();
        uow.delete(productToDel);

        System.out.println("---Удалили один элемент и НЕ вызвали коммит--------------");
        System.out.println(uow.getAll());
        System.out.println();

        uow.commint();
        System.out.println("---Удалили один элемент и вызвали коммит--------------");
        System.out.println(uow.getAll());
        System.out.println();


        Product productToModNew = new Product(productToMod.getId(), "Товар модифицированный", 1000);
        uow.update(productToModNew);

        System.out.println("---Модифицировали один элемент и НЕ вызвали коммит--------------");
        System.out.println(uow.getAll());
        System.out.println("");

        uow.commint();
        System.out.println("---Модифицировали один элемент и вызвали коммит--------------");
        System.out.println(uow.getAll());
        System.out.println("");
        
    }
}
