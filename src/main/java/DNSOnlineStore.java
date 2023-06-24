import DNS.*;

import java.util.List;

public class DNSOnlineStore {
    private final ProductHolder productHolder;
    private final PurchaseHistoryHolder purchaseHistoryHolder;
    private final ShoppingCartHolder shoppingCartHolder;
    private final UserHolder userHolder;

    public DNSOnlineStore() {
        this.productHolder = new ProductHolder();
        this.purchaseHistoryHolder = new PurchaseHistoryHolder(productHolder);
        this.shoppingCartHolder = new ShoppingCartHolder(productHolder);
        this.userHolder = new UserHolder();
    }

    public ProductHolder getProductHolder() {
        return productHolder;
    }

    public PurchaseHistoryHolder getPurchaseHistoryHolder() {
        return purchaseHistoryHolder;
    }

    public ShoppingCartHolder getShoppingCartHolder() {
        return shoppingCartHolder;
    }

    public UserHolder getUserHolder() {
        return userHolder;
    }

    public void addProduct(Product product) {
        getProductHolder().addProduct(product);
    }

    public List<Product> getProductList() {
        return getProductHolder().printListProduct();
    }

    public void buy(String idProduct) {
        getPurchaseHistoryHolder().buyProduct(idProduct);
    }

    public List<Product> getProductHistory() {
        return getPurchaseHistoryHolder().printHistory();
    }

    public void addProductCart(String idProduct) {
        getShoppingCartHolder().addProductShoppingCart(idProduct);
    }

    public void addUser(User user) {
        getUserHolder().addUser(user);
    }

    public List<User> getUserList() {
        return getUserHolder().printUser();
    }

    public void removeUser(String phoneNumber) {
        getUserHolder().removeUser(phoneNumber);
    }

    public void printCart() {
        getShoppingCartHolder().getShoppingCart();
    }

    public void removeProductCart(String idProduct) {
        getShoppingCartHolder().removeProductShoppingCart(idProduct);
    }
}