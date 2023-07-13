import DNS.*;

import java.util.List;

public class DNSOnlineStore {
    private final Warehouse warehouse;
    private final PurchaseHistory purchaseHistory;
    private final ShoppingCart shoppingCart;
    private final UserHolder userHolder;
    private final PriceList discountedPriceList;
    private final PriceList regularPriceList;
    private final Calculator calculator;
    private PurchaseService purchaseService;

    public DNSOnlineStore() {
        this.warehouse = new Warehouse();
        this.purchaseHistory = new PurchaseHistory();
        this.discountedPriceList=new PriceList();
        this.regularPriceList=new PriceList();
        this.shoppingCart = new ShoppingCart();
        this.userHolder = new UserHolder();
        this.calculator = new Calculator();
        this.purchaseService = new PurchaseService();

    }

    public PurchaseService getPurchaseService() {
        return purchaseService;
    }

    public void setPurchaseService(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public PurchaseHistory getPurchaseHistory() {
        return purchaseHistory;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
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

    public void buy(Product product, Warehouse warehouse, User user) {
        getPurchaseHistory().buyProduct(product, warehouse, user);
    }

    public List<Product> getProductHistory(User user) {
        return getPurchaseHistory().printHistory(user);
    }

    public void addProductCart(Product product, Warehouse warehouse, User user) {
        getShoppingCart().addProductShoppingCart(product, warehouse, user);
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

    public List<Product> printCart(User user) {
        return getShoppingCart().getProductCart(user);
    }

    public void removeProductCart(Product product, User user) {
        getShoppingCart().removeProductShoppingCart(product, user);
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

    public Calculator getCalculator() {
        return calculator;
    }

    public void addProductDiscountedPriceList(ProductPrice productPrice) {
        getDiscountedPriceList().addProductPrice(productPrice);
    }
    public double calculatorPrice(PriceList discountedPriceList, ShoppingCart shoppingCart, User user) {
        return getCalculator().calculateCartPrice(discountedPriceList, shoppingCart, user);
    }
    public void removeProduct(Product product1) {
        getWarehouse().removeProductWarehouse(product1);
    }
    public void addProductCartUser(User user, Product product, Warehouse warehouse) {
        getPurchaseService().addToCart(user, product, warehouse);
    }
    public void removeProductCartUser(User user, Product product, Warehouse warehouse) {
        getPurchaseService().removeFromCart(user, product, warehouse);
    }
    public void buyUser(User user, Product product, Warehouse warehouse) {
        getPurchaseService().buyProductUser(user, product, warehouse);
    }
    public double calculatorPriceUser(User user, PriceList priceList) {
        return getPurchaseService().calculatePrice(user, priceList);
    }
}
