import DNS.Product;
import DNS.ProductPrice;
import DNS.User;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        DNSOnlineStore dnsOnlineStore = new DNSOnlineStore();

        Product product1 = new Product("Телевизор","Лучший в России","12345");
        Product product2 = new Product("Холодильник","Морозит как надо!","54321");
        Product product3 = new Product("Телефон","Первый год лагать не будет","13542");
        Product product4 = new Product("Наушники","Сделаны в СССР","15242");

        System.out.println("-------------------Добавление товара-----------------");
        dnsOnlineStore.addProduct(product1);
        dnsOnlineStore.addProduct(product2);
        dnsOnlineStore.addProduct(product3);
        dnsOnlineStore.addProduct(product4);

        System.out.println("-------------------Удаление товара-----------------");
        dnsOnlineStore.removeProduct(product4);

        System.out.println("-------------------Список товаров--------------------");
        List<Product> productList=dnsOnlineStore.getProductList();
        System.out.println(productList);

        System.out.println("---------------------Создать аккаунт-------------------");
        User user1 = new User("+7111", "12345");
        User user2 = new User("+7222", "54321");
        dnsOnlineStore.addUser(user1);

        System.out.println("---------------Добавление товара в корзину 1 пользователся---------------");
        dnsOnlineStore.addProductCartUser(user1, product1, dnsOnlineStore.getWarehouse());
        dnsOnlineStore.addProductCartUser(user1, product2, dnsOnlineStore.getWarehouse());
        dnsOnlineStore.addProductCartUser(user1, product3, dnsOnlineStore.getWarehouse());
        dnsOnlineStore.addProductCartUser(user1, product4, dnsOnlineStore.getWarehouse());

        System.out.println("--------------------Товары в корзине у 1 пользователя------------------");
        List<Product> cartList = dnsOnlineStore.printCart(user1);
        System.out.println(cartList);

        System.out.println("---------------Добавление товара в корзину 2 пользователся---------------");
        dnsOnlineStore.addProductCartUser(user2, product3, dnsOnlineStore.getWarehouse());
        dnsOnlineStore.addProductCartUser(user2, product2, dnsOnlineStore.getWarehouse());

        System.out.println("--------------------Товары в корзине у 2 пользователя------------------");
        List<Product> cartList2 = dnsOnlineStore.printCart(user2);
        System.out.println(cartList2);

        System.out.println("-------------------Добавление товара в обычный прайс-лист--------------------");
        dnsOnlineStore.addProductRegularPriceList(new ProductPrice("12345", 12000));
        dnsOnlineStore.addProductRegularPriceList(new ProductPrice("54321", 23000));

        System.out.println("-------------------Добавление товара в прайс-лист со скидками --------------------");
        dnsOnlineStore.addProductDiscountedPriceList(new ProductPrice("13542", 8000));

        System.out.println("-------------------Вычисляем сумму товаров в корзине у 1 пользователя, используя обычный прайс-лист--------------------");
        double regularCartPriceSum = dnsOnlineStore.calculatorPriceUser(user1, dnsOnlineStore.getRegularPriceList());
        System.out.println("Стоимость товаров по обычному прайс листу: " + regularCartPriceSum);

        System.out.println("-------------------Вычисляем сумму товаров в корзине у 1 пользователя, используя прайс-лист со скидками--------------------");
        double discountedCartPriceSum =  dnsOnlineStore.calculatorPriceUser(user1, dnsOnlineStore.getDiscountedPriceList());
        System.out.println("Стоимость товаров по прайс листу со скидками: " + discountedCartPriceSum);

        System.out.println("-----------------Удалить товар из корзины 1 пользователя-------------");
        dnsOnlineStore.removeProductCartUser(user1, product1, dnsOnlineStore.getWarehouse());

        System.out.println("--------------------Товары в корзине у 1 пользователя------------------");
        System.out.println(cartList);

        System.out.println("-----------------------Купить товар--------------------");
        dnsOnlineStore.buyUser(user1, product1, dnsOnlineStore.getWarehouse());

        System.out.println("-------------------Список товаров--------------------");
        System.out.println(productList);

        System.out.println("---------------------История покупок-------------------");
        System.out.println(dnsOnlineStore.getProductHistory(user1));

        System.out.println("-------------------Список пользователей----------------");
        List<User> userList = dnsOnlineStore.getUserList();
        System.out.println(userList);

        System.out.println("-------------Удалить аккаунт пользователя--------------");
        dnsOnlineStore.removeUser("+7111");

        System.out.println("------------------Список пользователей------------------");
        System.out.println(userList);
    }
}