package DNS;

import java.text.MessageFormat;

public class Product {
    private final String productName;
    private final String description;
    private final String idProduct;
    public Product(String productName, String description, String productNumber) {
        this.productName = productName;
        this.description = description;
        this.idProduct = productNumber;
    }
    @Override
    public String toString(){
        return MessageFormat.format("\nИнформация о товаре: \nНазвание: {0}\nОписание товара: {1}\nНомер товара (артикул): {2}", getProductName(), getDescription(), getIdProduct());
    }
    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public String getIdProduct() {
        return idProduct;
    }
}
