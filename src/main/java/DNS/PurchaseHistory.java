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

    public void buyProduct(Product product, Warehouse warehouse, User user){/* купить товар */
        if(warehouse.productSearch(product)!=null){
            user.getPurchaseHistory().getProductList().add(product);
            System.out.println("Поздравляю с покупкой!");
            warehouse.removeProductWarehouse(product);
        }else {
            System.out.println("Товар не найден на складе");
        }

    }
    public List<Product> printHistory(User user){
        return user.getPurchaseHistory().getProductList();
    }
    @Override
    public String toString(){
        return "История покупок: "+getProductList();
    }
}
