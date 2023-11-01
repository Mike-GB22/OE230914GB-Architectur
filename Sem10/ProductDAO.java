package Sem10;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements DAO<Product> {
    private List<Product> products = new ArrayList<>();

    public int getSize(){
        return products.size();
    }
    @Override
    public Product findById(int id) {
        for (Product product : products){
            if (product.id == id) return product;
        }
        return null;
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    @Override
    public void add(Product t) {
        products.add(t);
    }

    @Override
    public void save(Product newT) {
        for(int i = 0; i < products.size(); i++){
            if (products.get(i).getId() == newT.getId()){
                products.set(i, newT);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        for(int i = 0; i < products.size(); i++){
            if (products.get(i).getId() == id){
                products.remove(i);
                return;
            }
        }
    }
}
