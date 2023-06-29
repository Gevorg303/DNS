package DNS;

import java.util.List;

public class Calculator{
    private ShoppingCartHolder shoppingCartHolder;

    public Calculator(ShoppingCartHolder shoppingCartHolder) {
        this.shoppingCartHolder = shoppingCartHolder;
    }
    public double calculateCartPrice(PriceList priceList){
        double totalPrice=0.0;
        List<Product> productList=getShoppingCartHolder().getProductCart();
        for(Product product:productList){
            double price=priceList.getPriceForProduct(product.getIdProduct());
            totalPrice+=price;
        }
        return totalPrice;
    }
    public ShoppingCartHolder getShoppingCartHolder() {
        return shoppingCartHolder;
    }

    public void setShoppingCartHolder(ShoppingCartHolder shoppingCartHolder) {
        this.shoppingCartHolder = shoppingCartHolder;
    }
}
