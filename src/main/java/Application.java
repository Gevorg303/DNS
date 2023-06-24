import DNS.Product;
import DNS.User;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        DNSOnlineStore dnsOnlineStore = new DNSOnlineStore();

        System.out.println("-------------------Добавление товара-----------------");
        dnsOnlineStore.addProduct(new Product("Телевизор",12000,"Лучший в России","456823"));

        System.out.println("-------------------Список товаров--------------------");
        List<Product> productList=dnsOnlineStore.getProductList();
        System.out.println(productList);

        System.out.println("---------------Добавить товар в корзину---------------");
        dnsOnlineStore.addProductCart("456823");

        System.out.println("--------------------Товары в корзине------------------");
        dnsOnlineStore.printCart();

        System.out.println("-----------------Удалить товар из корзины-------------");
        dnsOnlineStore.removeProductCart("456823");

        System.out.println("--------------------Товары в корзине-------------------");
        dnsOnlineStore.printCart();

        System.out.println("-----------------------Купить товар--------------------");
        dnsOnlineStore.buy("456823");

        System.out.println("---------------------История покупок-------------------");
        System.out.println(dnsOnlineStore.getProductHistory());

        System.out.println("---------------------Создать аккаунт-------------------");
        dnsOnlineStore.addUser(new User("+7111", "12345", dnsOnlineStore.getShoppingCartHolder(), dnsOnlineStore.getPurchaseHistoryHolder() ));

        System.out.println("-------------------Список пользователей----------------");
        List<User> userList = dnsOnlineStore.getUserList();
        System.out.println(userList);

        System.out.println("-------------Удалить аккаунт пользователя--------------");
        dnsOnlineStore.removeUser("+7111");

        System.out.println("------------------Список пользователей------------------");
        System.out.println(userList);
    }
}