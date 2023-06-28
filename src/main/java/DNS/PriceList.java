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
        productPrices.add(productPrice);
        System.out.println("Товар добавлен в обычный прайс лист"+productPrices.size());
    }
    public  double getProductPrice(String idProduct){
        for(ProductPrice productPrice:productPrices){
            if(Objects.equals(productPrice.getIdProduct(), idProduct)){
                return  productPrice.getPrice();
            }
        }
        return 0.0;
    }
}
