package DNS;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart{
    private final List<Product> productCart;
    public ShoppingCart() {
        this.productCart = new ArrayList<>();
    }
    public void addProductShoppingCart(Product product, Warehouse warehouse, User user){
        if(warehouse.productSearch(product)!=null) {
            user.getShoppingCart().getProductCart(user).add(product);
            System.out.println(product.getProductName() + " успешно добавлен в корзину");
        }else {
            System.out.println(product.getProductName() + " отсутствует на складе");
        }
    }
    public void removeProductShoppingCart(Product product, User user){
        if(productSearchCart(product, user)!=null) {
            user.getShoppingCart().getProductCart(user).remove(product);
            System.out.println(product.getProductName() + " успешно удален из корзины");
        }else {
            System.out.println(product.getProductName() + " нет в корзине");
        }
    }
    public Product productSearchCart(Product products, User user){
        for (Product product: user.getShoppingCart().getProductCart(user)) {
            if (product.getIdProduct().equals(products.getIdProduct())){
                return product;
            }
        }
        return null;
    }
    public String toString(){
        return "Корзина товаров: "+productCart;
    }
    public List<Product> getProductCart(User user) {
        return user.getShoppingCart().productCart;
    }
}
