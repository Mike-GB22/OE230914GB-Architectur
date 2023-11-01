package Sem10;

import java.util.List;

public class ProductRepository implements Repository<Product>{
    private DAO<Product> dao = new ProductDAO();

    @Override
    public Product getById(int id) {
        return dao.findById(id);
    }

    @Override
    public List<Product> getAll() {
        return dao.findAll();
    }

    @Override
    public void add(Product t) {
        if(t.getPrice() < 0) return;
        dao.add(t);
    }

    @Override
    public void update(Product newT) {
        dao.save(newT);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }
    
}
