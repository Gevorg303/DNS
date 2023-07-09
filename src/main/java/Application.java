import DNS.Product;
import DNS.ProductPrice;
import DNS.User;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        DNSOnlineStore dnsOnlineStore = new DNSOnlineStore();

        Product product1 = new Product("Телевизор","Лучший в России","456823");
        Product product2 = new Product("Холодильник","Морозит как надо!","12345");
        Product product3 = new Product("Телефон","Первый год лагать не будет","54321");

        System.out.println("-------------------Добавление товара-----------------");
        dnsOnlineStore.addProduct(product1);
        dnsOnlineStore.addProduct(product2);
        dnsOnlineStore.addProduct(product3);

        System.out.println("-------------------Список товаров--------------------");
        List<Product> productList=dnsOnlineStore.getProductList();
        System.out.println(productList);

        System.out.println("---------------Добавить товар в корзину---------------");
        dnsOnlineStore.addProductCart(product1, dnsOnlineStore.getWarehouse());
        dnsOnlineStore.addProductCart(product2, dnsOnlineStore.getWarehouse());

        System.out.println("--------------------Товары в корзине------------------");
        List<Product> cartList = dnsOnlineStore.printCart();
        System.out.println(cartList);

        System.out.println("-------------------Добавление товара в обычный прайс-лист--------------------");
        dnsOnlineStore.addProductRegularPriceList(new ProductPrice("456823", 12000));
        dnsOnlineStore.addProductRegularPriceList(new ProductPrice("12345", 26000));

        System.out.println("-------------------Добавление товара в прайс-лист со скидками --------------------");
        dnsOnlineStore.addProductDiscountedPriceList(new ProductPrice("456823", 8000));

        System.out.println("-------------------Вычисляем сумму товаров в корзине, используя обычный прайс-лист--------------------");
        double regularCartPrice = dnsOnlineStore.calculateCartPrice(dnsOnlineStore.getRegularPriceList());
        System.out.println("Стоимость товаров по обычному прайс листу: " + regularCartPrice);

        System.out.println("-------------------Вычисляем сумму товаров в корзине, используя прайс-лист со скидками--------------------");
        double discountedCartPrice = dnsOnlineStore.calculateCartPrice(dnsOnlineStore.getDiscountedPriceList());
        System.out.println("Стоимость товаров по прайс листу со скидками: " + discountedCartPrice);

        System.out.println("-----------------Удалить товар из корзины-------------");
        dnsOnlineStore.removeProductCart(product1, dnsOnlineStore.getWarehouse());

        System.out.println("--------------------Товары в корзине-------------------");
        System.out.println(cartList);

        System.out.println("-----------------------Купить товар--------------------");
        dnsOnlineStore.buy(product1, dnsOnlineStore.getWarehouse());

        System.out.println("---------------------История покупок-------------------");
        System.out.println(dnsOnlineStore.getProductHistory());

        System.out.println("---------------------Создать аккаунт-------------------");
        dnsOnlineStore.addUser(new User("+7111", "12345", dnsOnlineStore.getShoppingCartHolder().getShoppingCart(), dnsOnlineStore.getPurchaseHistoryHolder().getPurchaseHistory()));

        System.out.println("-------------------Список пользователей----------------");
        List<User> userList = dnsOnlineStore.getUserList();
        System.out.println(userList);

        System.out.println("-------------Удалить аккаунт пользователя--------------");
        dnsOnlineStore.removeUser("+7111");

        System.out.println("------------------Список пользователей------------------");
        System.out.println(userList);
    }
}