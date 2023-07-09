package DNS;

import java.util.List;

public class PurchaseHistoryHolder{
    private final PurchaseHistory purchaseHistory;
    public PurchaseHistoryHolder() {
        this.purchaseHistory=new PurchaseHistory();
    }
    public void buyProduct(Product product, Warehouse warehouse){/* купить товар */
        if(warehouse.productSearch(product.getIdProduct())){
            getPurchaseHistory().getProductList().add(product);
            System.out.println("Поздравляю с покупкой!");
        }else {
            System.out.println("Товар с таким артикулом на складе не найден");
        }

    }
    public List<Product> printHistory(){
        return getPurchaseHistory().getProductList();
    }

    public PurchaseHistory getPurchaseHistory() {
        return purchaseHistory;
    }
}
