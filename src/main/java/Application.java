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
        dnsOnlineStore.addUser(user1);

        System.out.println("---------------Добавить товар в корзину---------------");
        dnsOnlineStore.addProductCart(product1, dnsOnlineStore.getWarehouse(), user1);
        dnsOnlineStore.addProductCart(product2, dnsOnlineStore.getWarehouse(), user1);
        dnsOnlineStore.addProductCart(product4, dnsOnlineStore.getWarehouse(), user1);
        dnsOnlineStore.addProductCart(product3, dnsOnlineStore.getWarehouse(), user1);

        System.out.println("--------------------Товары в корзине------------------");
        List<Product> cartList = dnsOnlineStore.printCart(user1);
        System.out.println(cartList);

        System.out.println("-------------------Добавление товара в обычный прайс-лист--------------------");
        dnsOnlineStore.addProductRegularPriceList(new ProductPrice("12345", 12000));
        dnsOnlineStore.addProductRegularPriceList(new ProductPrice("54321", 23000));

        System.out.println("-------------------Добавление товара в прайс-лист со скидками --------------------");
        dnsOnlineStore.addProductDiscountedPriceList(new ProductPrice("13542", 8000));

        System.out.println("-------------------Вычисляем сумму товаров в корзине, используя обычный прайс-лист--------------------");
        double regularCartPrice = dnsOnlineStore.calculatorPrice(dnsOnlineStore.getRegularPriceList(), dnsOnlineStore.getShoppingCart(), user1);

        System.out.println("Стоимость товаров по обычному прайс листу: " + regularCartPrice);

        System.out.println("-------------------Вычисляем сумму товаров в корзине, используя прайс-лист со скидками--------------------");
        double discountedCartPrice = dnsOnlineStore.getCalculator().calculateCartPrice(dnsOnlineStore.getDiscountedPriceList(), dnsOnlineStore.getShoppingCart(), user1);
        System.out.println("Стоимость товаров по прайс листу со скидками: " + discountedCartPrice);

        System.out.println("-----------------Удалить товар из корзины-------------");
        dnsOnlineStore.removeProductCart(product2, user1);

        System.out.println("--------------------Товары в корзине-------------------");
        System.out.println(cartList);

        System.out.println("-----------------------Купить товар--------------------");
        dnsOnlineStore.buy(product1, dnsOnlineStore.getWarehouse(), user1);

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