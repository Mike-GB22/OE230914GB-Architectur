package Sem10;

import java.util.List;

public class ProductService implements Service<Product>{
    private Repository<Product> repository = new ProductRepository();

    @Override
    public Product getByIdWithLogic(int id) {
        // Logic
        return repository.getById(id);
    }

    @Override
    public List<Product> getAllWithLogic() {
        // Logic
        return repository.getAll();
    }

    @Override
    public void addWithLogic(Product t) {
        // Logic
        if(t.getPrice() <= 0) return;
        repository.add(t);
    }

    @Override
    public void updateWithLogic(Product newT) {
        // Logic
        repository.update(newT);
    }

    @Override
    public void deleteWithLogic(int id) {
        // Logic
        repository.delete(id);
    }
}
