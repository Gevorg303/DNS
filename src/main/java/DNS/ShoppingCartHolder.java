package DNS;

public class ShoppingCartHolder{
    private final ShoppingCart shoppingCart;
    public ShoppingCartHolder() {
        this.shoppingCart= new ShoppingCart();
    }

    public void addProductShoppingCart(Product product, Warehouse warehouse){
        if(warehouse.productSearch(product.getIdProduct())){
            getShoppingCart().getProductCart().add(product);
            System.out.println(product.getProductName()+" успешно добавлен в корзину");
        }else {
            System.out.println("Товар с таким артикулом на складе не найден");
        }
    }
    public void removeProductShoppingCart(Product product, Warehouse warehouse){
        if(warehouse.productSearch(product.getIdProduct())) {
            getShoppingCart().getProductCart().remove(product);
            System.out.println(product.getProductName()+" успешно удален");
        }else {
            System.out.println("Товар с таким артикулом на складе не найден");
        }
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}
