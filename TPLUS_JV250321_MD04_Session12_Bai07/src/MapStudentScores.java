import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapStudentScores {
    public static void main(String[] args) {
        Map<String, Double> studentScores = new HashMap<>();
        studentScores.put("Nguyen Van A", 1.0);
        studentScores.put("Tran Thi B", 4.0);
        studentScores.put("Le Thi C", 3.0);
        studentScores.put("Hoang Van D", 4.0);

        Map<Double, List<String>> sameScores = new HashMap<>();

        for (Map.Entry<String, Double> entry : studentScores.entrySet()) {
            if (sameScores.containsKey(entry.getValue())) {
                sameScores.get(entry.getValue()).add(entry.getKey());
            } else {
                List<String> list = new ArrayList<>();
                list.add(entry.getKey());
                sameScores.put(entry.getValue(), list);
            }
        }

        System.out.println("Map sau khi nhom tat ca hoc sinh co cung diem:");
        for (Map.Entry<Double, List<String>> entry : sameScores.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
