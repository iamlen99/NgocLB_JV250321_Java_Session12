import entity.Product;

import java.util.*;

public class ProductManager {

    public static Map<String, Double> products = new LinkedHashMap<>();

    public static void main(String[] args) {
        products.put("Computer", 1500.0);
        products.put("Iphone", 600.0);
        products.put("Laptop", 1200.0);
        products.put("Monitor", 400.0);
        products.put("Keyboard", 50.0);

        sortProductsByPrice();
        displayProducts();
    }

    public static void sortProductsByPrice() {
        List<Product> productList = new ArrayList<>();
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            productList.add(new Product(entry.getKey(), entry.getValue()));
        }

        Collections.sort(productList, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        products.clear();
        for (Product product : productList) {
            products.put(product.getName(), product.getPrice());
        }
    }

    public static void displayProducts() {
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
