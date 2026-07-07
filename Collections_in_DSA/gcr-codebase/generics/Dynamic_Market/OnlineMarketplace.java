package Dynamic_Market;

import java.util.*;

class Category {
}

class BookCategory extends Category {
}

class ClothingCategory extends Category {
}

class GadgetCategory extends Category {
}

class Product<T extends Category> {

    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String toString() {
        return name + " Price : " + price;
    }
}

public class OnlineMarketplace {

    static <T extends Product<?>> void applyDiscount(T product, double percent) {
        product.price = product.price - (product.price * percent / 100);
    }

    public static void main(String args[]) {

        Product<BookCategory> book =
                new Product<>("Java Book", 500, new BookCategory());

        Product<GadgetCategory> phone =
                new Product<>("Phone", 25000, new GadgetCategory());

        applyDiscount(book, 10);
        applyDiscount(phone, 15);

        System.out.println(book);
        System.out.println(phone);
    }
} 