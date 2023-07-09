package DNS;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private final List<Product> products;

    public Warehouse() {
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product){/* добавить новый товар */
        getProducts().add(product);
        System.out.println(product.getProductName()+" успешно добавлен");
    }
    public boolean productSearch(String idProduct){
        for (Product product: getProducts()) {
            if (product.getIdProduct().equals(idProduct)){
                return true;
            }
        }
        return false;
    }
    public List<Product> printListProduct(){/* вывести список товаров */
        return getProducts();
    }
    public Product printInfoProduct(Product product){/* вывести информацию об одном товаре */
        return product;
    }
    public List<Product> getProducts() {
        return products;
    }
}
