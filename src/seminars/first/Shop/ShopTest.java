package seminars.first.Shop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ShopTest {

  @Test
  public void testSetAndGetProducts() {
    // Создаем продукты
    Product product1 = new Product();
    product1.setTitle("Product 1");
    product1.setCost(50);

    Product product2 = new Product();
    product2.setTitle("Product 2");
    product2.setCost(30);

    // Создаем магазин и устанавливаем продукты
    Shop shop = new Shop();
    shop.setProducts(Arrays.asList(product1, product2));

    // Проверяем, что метод getProducts возвращает ожидаемый список продуктов
    Assertions.assertThat(shop.getProducts()).containsExactly(product1, product2);
  }

  @Test
  public void testGetMostExpensiveProduct() {
    // Создаем продукты
    Product product1 = new Product();
    product1.setTitle("Product 1");
    product1.setCost(50);

    Product product2 = new Product();
    product2.setTitle("Product 2");
    product2.setCost(30);

    // Создаем магазин и устанавливаем продукты
    Shop shop = new Shop();
    shop.setProducts(Arrays.asList(product1, product2));

    // Проверяем, что метод getMostExpensiveProduct возвращает самый дорогой продукт
    Assertions.assertThat(shop.getMostExpensiveProduct()).isEqualTo(product1);
  }

  @Test
  public void testSortProductsByPrice() {
    // Создаем продукты
    Product product1 = new Product();
    product1.setTitle("Product 1");
    product1.setCost(50);

    Product product2 = new Product();
    product2.setTitle("Product 2");
    product2.setCost(30);

    // Создаем магазин и устанавливаем продукты
    Shop shop = new Shop();
    shop.setProducts(Arrays.asList(product1, product2));

    // Получаем отсортированный по цене список продуктов
    List<Product> sortedProducts = shop.sortProductsByPrice();

    // Проверяем, что список отсортирован по возрастанию цены
    Assertions.assertThat(sortedProducts).containsExactly(product2, product1);
  }
}
