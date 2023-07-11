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
        System.out.println(product.getProductName()+" успешно добавлен на склад");
    }
    public void removeProductWarehouse(Product product){
        if(productSearch(product)!=null) {
            getProducts().remove(product);
            System.out.println(product.getProductName() + " успешно удален из склада");
        }else {
            System.out.println(product.getProductName() + " не найден в складе");
        }
    }
    public Product productSearch(Product products){
        for (Product product: getProducts()) {
            if (product.getIdProduct().equals(products.getIdProduct())){
                return product;
            }
        }
        return null;
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
