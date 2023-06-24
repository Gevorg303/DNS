package DNS;

import java.util.ArrayList;
import java.util.List;

public class PurchaseHistory {
    private final List<Product> productList ;
    public PurchaseHistory() {
        this.productList = new ArrayList<>();
    }
    public List<Product> getProductList() {
        return productList;
    }
    @Override
    public String toString(){
        return "История покупок: "+getProductList();
    }
}
