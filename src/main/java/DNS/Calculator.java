package DNS;

import java.util.List;

public class Calculator{
    public double calculateCartPrice(PriceList priceList, ShoppingCart shoppingCart, User user){
        double totalPrice=0.0;
        List<Product> productList=shoppingCart.getProductCart(user);
        for(Product product:productList){
            double price=priceList.getPriceForProduct(product.getIdProduct());
            totalPrice+=price;
        }
        return totalPrice;
    }
}
