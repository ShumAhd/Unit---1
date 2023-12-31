package seminars.first.Shop;

import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        // Используем компаратор для сравнения продуктов по цене
        products.sort(Comparator.comparing(Product::getCost));
        return products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        if (products == null || products.isEmpty()) {
            return null; // Вернуть null, если список продуктов пуст
        }

        // Используем стрим для поиска максимальной цены
        return products.stream()
            .max(Comparator.comparing(Product::getCost))
            .orElse(null); // Вернуть null, если максимальный элемент не найден
    }
}
