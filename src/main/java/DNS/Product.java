package DNS;

import java.text.MessageFormat;

public class Product {
    private final String productName;
    private final float price;
    private final String description;
    private final String idProduct;
    public Product(String productName, float price, String description, String productNumber) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.idProduct = productNumber;
    }
    @Override
    public String toString(){
        return MessageFormat.format("\nИнформация о товаре: \nНазвание: {0}\nЦена товара: {1}\nОписание товара: {2}\nНомер товара (артикул): {3}", getProductName(), getPrice(), getDescription(), getIdProduct());
    }
    public String getProductName() {
        return productName;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getIdProduct() {
        return idProduct;
    }
}
