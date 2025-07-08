import java.util.HashMap;
import java.util.Map;

public class CompareTwoMap {
    public static void main(String[] args) {
        Map<String, Double> firstStudentScores = new HashMap<>();
        firstStudentScores.put("Nguyen Van A", 10.0);
        firstStudentScores.put("Tran Van B", 7.0);
        firstStudentScores.put("Hoang Van C", 3.0);
        firstStudentScores.put("Nguyen Thi D", 4.0);
        firstStudentScores.put("Truong Van E", 5.0);

        Map <String, Double> secondStudentScores = new HashMap<>();
//        secondStudentScores.put("Nguyen Van A", 4.0);
//        secondStudentScores.put("Nguyen Van B", 9.0);
//        secondStudentScores.put("Tran Van C", 7.0);
//        secondStudentScores.put("Hoang Thi D", 5.0);
//        secondStudentScores.put("Nguyen Van E", 8.0);
        secondStudentScores.put("Nguyen Van A", 10.0);
        secondStudentScores.put("Nguyen Thi D", 4.0);
        secondStudentScores.put("Tran Van B", 7.0);
        secondStudentScores.put("Hoang Van C", 3.0);
        secondStudentScores.put("Truong Van E", 5.0);

        if (firstStudentScores.size() != secondStudentScores.size()) {
            System.out.println("Hai map khong giong nhau");
        } else {
            int count = 0;
            for (Map.Entry<String, Double> entry : firstStudentScores.entrySet()) {
                if (secondStudentScores.containsKey(entry.getKey()) && secondStudentScores.get(entry.getKey()).equals(entry.getValue())) {
                    count++;
                }
            }
            if (count == secondStudentScores.size()) {
                System.out.println("Hai map giong nhau");
            } else {
                System.out.println("Hai map Khong giong nhau");
            }
        }
    }
}
