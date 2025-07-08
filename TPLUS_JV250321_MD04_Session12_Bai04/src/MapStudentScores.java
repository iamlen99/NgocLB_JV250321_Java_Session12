import java.util.HashMap;
import java.util.Map;

public class MapStudentScores {
    public static void main(String[] args) {
        Map <String, Double> firstStudentScores = new HashMap<>();
        firstStudentScores.put("Nguyen Van A", 10.0);
        firstStudentScores.put("Tran Van B", 7.0);
        firstStudentScores.put("Hoang Van C", 3.0);
        firstStudentScores.put("Nguyen Thi D", 4.0);
        firstStudentScores.put("Truong Van E", 5.0);

        Map <String, Double> secondStudentScores = new HashMap<>();
        secondStudentScores.put("Nguyen Van A", 4.0);
        secondStudentScores.put("Nguyen Van B", 9.0);
        secondStudentScores.put("Tran Van C", 7.0);
        secondStudentScores.put("Hoang Thi D", 5.0);
        secondStudentScores.put("Nguyen Van E", 8.0);

        for (Map.Entry<String, Double> entry : secondStudentScores.entrySet()) {
            if (firstStudentScores.containsKey(entry.getKey())) {
                firstStudentScores.put(entry.getKey(), firstStudentScores.get(entry.getKey()) + entry.getValue());
            } else {
                firstStudentScores.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println("Map sau khi gop:");
        for (Map.Entry<String, Double> entry : firstStudentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
