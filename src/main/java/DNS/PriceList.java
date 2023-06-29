package DNS;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PriceList {
    private final List<ProductPrice> productPrices;

    public PriceList() {
        this.productPrices = new ArrayList<>();
    }
    public void addProductPrice(ProductPrice productPrice){
        getProductPrices().add(productPrice);
        System.out.println("Товар добавлен в прайс лист");
    }
    public double getProductPrice(String idProduct){
        for(ProductPrice productPrice:getProductPrices()){
            if(Objects.equals(productPrice.getIdProduct(), idProduct)){
                return  productPrice.getPrice();
            }
        }
        return 0.0;
    }
    public double getPriceForProduct(String idProduct){
        for(ProductPrice productPrice: productPrices){
            if(productPrice.getIdProduct()==idProduct){
                return productPrice.getPrice();
            }
        }
        return 0.0;
    }

    public List<ProductPrice> getProductPrices() {
        return productPrices;
    }
}
