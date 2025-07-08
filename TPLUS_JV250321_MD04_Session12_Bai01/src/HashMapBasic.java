import java.util.HashMap;
import java.util.Map;

public class HashMapBasic {
    public static void main(String[] args) {
        Map<String, Integer> listStudentScore = new HashMap<>();
        listStudentScore.put("Nguyen Van A", 7);
        listStudentScore.put("Tran Van B", 9);
        listStudentScore.put("Le Thi C", 8);
        listStudentScore.put("Ly Van D", 6);
        listStudentScore.put("Dinh Thi E", 5);

        System.out.println("Danh sach cac hoc sinh cung voi diem so:");
        for (Map.Entry<String, Integer> entry : listStudentScore.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        String searchValue = "Nguyen Van A";
        if (listStudentScore.containsKey(searchValue)) {
            System.out.printf("Diem so cua %s : %d", searchValue, listStudentScore.get("Nguyen Van A"));
        } else {
            System.out.println("Khong tim thay hoc sinh nao co ten ban vua nhap");
        }
    }
}
