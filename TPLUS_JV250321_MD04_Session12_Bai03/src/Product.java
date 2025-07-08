import java.util.HashMap;
import java.util.Map;

public class Product {
    public static void main(String[] args) {
        Map<String, Double> mapProducts = new HashMap<>();
        mapProducts.put("Laptop", 1500.0);
        mapProducts.put("Ipad", 290.0);
        mapProducts.put("Iphone", 1200.0);
        mapProducts.put("Headphone", 400.0);
        mapProducts.put("Watch", 500.0);

        double maxPrice = findMaxPrice(mapProducts);

        System.out.println("San pham co gia lon nhat la:");
        for (Map.Entry<String, Double> entry : mapProducts.entrySet()) {
            if (entry.getValue() == maxPrice) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

    }

    public static double findMaxPrice(Map<String, Double> mapProducts) {
        double maxPrice = Double.MIN_VALUE;
        for (Double price : mapProducts.values()) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }
}
