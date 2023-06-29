package DNS;

public class ShoppingCartHolder extends ShoppingCart{
    private final ProductHolder productHolder;
    public ShoppingCartHolder(ProductHolder productHolder) {
        this.productHolder = productHolder;
    }

    public void addProductShoppingCart(String idProduct){
        boolean f = false;
        for (Product product:getProductHolder().getProducts()) {
            if (product.getIdProduct().equals(idProduct)){
                getProductCart().add(product);
                System.out.println(product.getProductName()+" успешно добавлен в корзину");
                f = true;
                break;
            }
        }
        if (!f){
            System.out.println("Товар c таким артикулом не найден");
        }

    }
    public void removeProductShoppingCart(String idProduct){
        for (Product product: getProductCart()) {
            if(product.getIdProduct().equals(idProduct)) {
                getProductCart().remove(product);
                System.out.println(product.getProductName()+" успешно удален");
                break;
            }
            System.out.println("Товар не найден");
        }
    }
    public double calculateCartPrice(PriceList priceList){
        double totalPrice=0.0;
        for (Product product: getProductCart()){
            double productPrice=priceList.getProductPrice(product.getIdProduct());
            totalPrice+=productPrice;
        }
        return  totalPrice;
    }
    public ProductHolder getProductHolder() {
        return productHolder;
    }

    public void getShoppingCart() {
        System.out.println(getProductCart());
    }
}
