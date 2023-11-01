package Sem10;

import java.util.ArrayList;
import java.util.List;

public class ProductUnitOfWork implements UnitOfWork<Product>{
    private Service<Product> repositoryThrowServiceOrigin = new ProductService();
    private Service<Product> repositoryThrowServiceToAdd = new ProductService();
    private Service<Product> repositoryThrowServiceToDel = new ProductService();
    private Service<Product> repositoryThrowServiceToMod = new ProductService();

    @Override
    public void add(Product t) {
        repositoryThrowServiceToAdd.addWithLogic(t);
    }

    @Override
    public void delete(Product t) {
        repositoryThrowServiceToDel.addWithLogic(t);
    }

    @Override
    public void commint() {

        List<Product> toMod = repositoryThrowServiceToMod.getAllWithLogic();
        for (Product product : toMod){
            repositoryThrowServiceOrigin.updateWithLogic(product);
        }
        clearRepositoryToMod();

        List<Product> toDel = repositoryThrowServiceToDel.getAllWithLogic();
        for (Product product : toDel){
            repositoryThrowServiceOrigin.deleteWithLogic(product.getId());
        }
        clearRepositoryToDel();
       
        List<Product> toAdd = repositoryThrowServiceToAdd.getAllWithLogic();
        for (Product product : toAdd){
            repositoryThrowServiceOrigin.addWithLogic(product);
        }
        clearRepositoryToAdd();

    }

    @Override
    public void cancel() {
        clearRepositoryToAdd();
        clearRepositoryToDel();
        clearRepositoryToMod();

    }

    public void clearRepositoryToAdd(){
        repositoryThrowServiceToAdd = new ProductService();
    }
    public void clearRepositoryToDel(){
        repositoryThrowServiceToDel = new ProductService();
    }
    public void clearRepositoryToMod(){
        repositoryThrowServiceToMod = new ProductService();
    }

    @Override
    public List<Product> getAll() {
        List<Product> toReturn = new ArrayList<>();
        toReturn.addAll(repositoryThrowServiceOrigin.getAllWithLogic());
        toReturn.addAll(repositoryThrowServiceToAdd.getAllWithLogic());
        return toReturn;
    }

    @Override
    public Product getById(int id) {
        Product toReturn = repositoryThrowServiceOrigin.getByIdWithLogic(id);
        if (toReturn == null) toReturn = repositoryThrowServiceToAdd.getByIdWithLogic(id);
        return toReturn;
    }

    @Override
    public void update(Product newT) {
        repositoryThrowServiceToMod.addWithLogic(newT);
    }
    
}
