package DNS;

public class User {
    private String phoneNumber;
    private String password;
    private ShoppingCart shoppingCart;
    private PurchaseHistory purchaseHistory;
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

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void setPurchaseHistory(PurchaseHistory purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }
}
