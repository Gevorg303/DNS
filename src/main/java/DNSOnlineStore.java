import DNS.*;

import java.util.List;

public class DNSOnlineStore {
    private final Warehouse warehouse;
    private final PurchaseHistoryHolder purchaseHistoryHolder;
    private final ShoppingCartHolder shoppingCartHolder;
    private final UserHolder userHolder;
    private final PriceList discountedPriceList;
    private final PriceList regularPriceList;
    private final Calculator calculator;

    public DNSOnlineStore() {
        this.warehouse = new Warehouse();
        this.purchaseHistoryHolder = new PurchaseHistoryHolder();
        this.discountedPriceList=new PriceList();
        this.regularPriceList=new PriceList();
        this.shoppingCartHolder = new ShoppingCartHolder();
        this.userHolder = new UserHolder();
        this.calculator = new Calculator(shoppingCartHolder);

    }
    public Warehouse getWarehouse() {
        return warehouse;
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
        getWarehouse().addProduct(product);
    }

    public List<Product> getProductList() {
        return getWarehouse().printListProduct();
    }

    public void buy(Product product, Warehouse warehouse) {
        getPurchaseHistoryHolder().buyProduct(product, warehouse);
    }

    public List<Product> getProductHistory() {
        return getPurchaseHistoryHolder().printHistory();
    }

    public void addProductCart(Product product, Warehouse warehouse) {
        getShoppingCartHolder().addProductShoppingCart(product, warehouse);
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

    public List<Product> printCart() {
        return getShoppingCartHolder().getShoppingCart().getProductCart();
    }

    public void removeProductCart(Product product, Warehouse warehouse) {
        getShoppingCartHolder().removeProductShoppingCart(product, warehouse);
    }

    public void addProductRegularPriceList(ProductPrice productPrice) {
        getRegularPriceList().addProductPrice(productPrice);
    }
    public PriceList getDiscountedPriceList() {
        return discountedPriceList;
    }

    public PriceList getRegularPriceList() {
        return regularPriceList;
    }

    public double calculateCartPrice(PriceList priceList) {
        return calculator.calculateCartPrice(priceList);
    }

    public void addProductDiscountedPriceList(ProductPrice productPrice) {
        getDiscountedPriceList().addProductPrice(productPrice);
    }
}
