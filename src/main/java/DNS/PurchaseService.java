package DNS;

public class PurchaseService {
    public void addToCart(User user, Product product, Warehouse warehouse){
        Product productFinal = warehouse.productSearch(product);
        if(productFinal!=null){
            user.getShoppingCart().addProductShoppingCart(productFinal, warehouse, user);
        }else {
            System.out.println("Данный товар на складе не обнаружан");
        }
    }
    public void removeFromCart(User user, Product product, Warehouse warehouse){
        Product productFinal = warehouse.productSearch(product);
        if(productFinal!=null){
            user.getShoppingCart().removeProductShoppingCart(productFinal, user);
        }else {
            System.out.println("Данный товар на складе не обнаружан");
        }
    }
    public void buyProductUser(User user, Product product, Warehouse warehouse){
        Product productFinal = warehouse.productSearch(product);
        if(productFinal!=null){
            user.getPurchaseHistory().buyProduct(productFinal, warehouse, user);
        }else {
            System.out.println("Данный товар на складе не обнаружан");
        }
    }
    public double calculatePrice(User user, PriceList priceList) {
        Calculator calculator = new Calculator();
        return calculator.calculateCartPrice(priceList, user.getShoppingCart(), user);
    }
}
