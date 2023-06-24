package DNS;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart{
    private final List<Product> productCart;
    public ShoppingCart() {
        this.productCart = new ArrayList<>();
    }
    public String toString(){
        return "Корзина покупок: "+productCart;
    }
    public List<Product> getProductCart() {
        return productCart;
    }
}
