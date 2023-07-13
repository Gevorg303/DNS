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
    public double calculateRegularTotalPrice(User user, PriceList regularPriceList) {
        Calculator calculator = new Calculator();
        return calculator.calculateCartPrice(regularPriceList, user.getShoppingCart(), user);
    }

    public double calculateDiscountedTotalPrice(User user, PriceList discountedPriceList) {
        Calculator calculator = new Calculator();
        return calculator.calculateCartPrice(discountedPriceList, user.getShoppingCart(), user);
    }
}
