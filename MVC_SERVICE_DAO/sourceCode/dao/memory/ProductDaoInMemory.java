package dao.memory;
import java.util.ArrayList;
import dao.ProductDao;
import model.Product;

public class ProductDaoInMemory implements ProductDao {

    private final ArrayList<Product> storage = new ArrayList<>();
    private int nextId = 1;

    public ProductDaoInMemory(){
        storage.add(new Product(1, "laptop", 950000));
        storage.add(new Product(2, "smartphone", 500000));
        nextId = 3;
    }

    @Override
    public void save(Product product){
        if (product.getId() == 0) {
            product.setId(nextId++);
        }
        storage.add(product);
    }

    @Override
    public ArrayList<Product> findAll(){
        return storage;
    }
}
