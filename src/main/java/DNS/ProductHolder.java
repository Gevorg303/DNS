package DNS;

import java.util.ArrayList;
import java.util.List;

public class ProductHolder {
    private final List<Product> products;

    public ProductHolder() {
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product){/* добавить новый товар */
        getProducts().add(product);
        System.out.println(product.getProductName()+" успешно добавлен");
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
