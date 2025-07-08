import java.util.HashMap;
import java.util.Map;

public class Product {
    public static void main(String[] args) {
        Map<String, Float> products = new HashMap<>();
        products.put("Mouse", 100f);
        products.put("Laptop", 1300f);
        products.put("Monitor", 300f);
        products.put("Iphone", 1000f);
        products.put("Bag", 500f);

        String searchKey = "Laptop";
        if (products.containsKey(searchKey)) {
            System.out.printf("Tim thay key \"%s\" voi gia tri la %.1f\n", searchKey, products.get(searchKey));
        } else {
            System.out.println("Khong tim thay san pham co ten ban vua nhap");
        }

        Float searchValue = 1000F;
        boolean isExist = false;
        for (Map.Entry<String, Float> entry : products.entrySet()) {
            if (entry.getValue().equals(searchValue)) {
                System.out.printf("Tim thay san pham %s co gia la %.1f\n", entry.getKey(), searchValue);
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.println("Khong tim thay san pham co gia ban vua nhap");
        }

    }
}
