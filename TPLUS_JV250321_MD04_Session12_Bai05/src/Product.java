import java.util.HashMap;
import java.util.Map;

public class Product {
    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<>();
        products.put("Laptop", 1200.0);
        products.put("Iphone", 600.0);
        products.put("Computer", 1400.0);
        products.put("Monitor", 200.0);
        products.put("Keyboard", 100.0);

        System.out.println("Danh sach cac san pham co gia tu 500 den 1500:");
        for (Map.Entry<String, Double> product : products.entrySet()) {
            if (product.getValue() > 500 && product.getValue() < 1500) {
                System.out.println(product.getKey() + ": " + product.getValue());
            }
        }
    }
}
