package DNS;

public class User {
    private final String phoneNumber;
    private final String password;
    private final ShoppingCart shoppingCart;
    private final PurchaseHistory purchaseHistory;
    public User(String phoneNumber, String password, ShoppingCart shoppingCart, PurchaseHistory purchaseHistory) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.shoppingCart = shoppingCart;
        this.purchaseHistory=purchaseHistory;
    }
    @Override
    public String toString(){
        return "Информация о пользователе:\n"+"Номер телефона: "+ getPhoneNumber()+"\nПароль: "+getPassword()+"\n"+getShoppingCart()+"\n"+getPurchaseHistory();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getPassword() {
        return password;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public PurchaseHistory getPurchaseHistory() {
        return purchaseHistory;
    }
}
