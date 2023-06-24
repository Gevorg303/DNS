package DNS;

import java.util.List;

public class PurchaseHistoryHolder extends PurchaseHistory{
    private final ProductHolder productHolder;
    public PurchaseHistoryHolder(ProductHolder productHolder) {
        this.productHolder = productHolder;
    }
    public void buyProduct(String idProduct){/* купить товар */
        for (Product product:productHolder.getProducts()){
            if(product.getIdProduct().equals(idProduct)){
                getProductList().add(product);
                System.out.println("Поздравляю с покупкой!");
                break;
            }
            System.out.println( "Товар с таким артикулом не найден");
            break;
        }
    }
    public List<Product> printHistory(){
        return getProductList();
    }
}
