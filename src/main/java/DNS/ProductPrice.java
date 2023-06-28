package DNS;

public class ProductPrice {
    private String idProduct;
    private double price;

    public ProductPrice(String idProduct, double price) {
        this.idProduct = idProduct;
        this.price = price;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
