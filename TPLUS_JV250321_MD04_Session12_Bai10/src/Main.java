import entity.Student;

import java.util.*;

public class Main {
    public static List<Student> students = new ArrayList<>();
    enum academicPerformance {
        Gioi, Kha, Trung_binh, Yeu
    }

    public static void main(String[] args) {
        students.add(new Student(1, "Le Bao Ngoc", 8.9));
        students.add(new Student(2, "Le Dinh Khoa", 8.3));
        students.add(new Student(3, "Le Thi Phi Yen", 6.9));
        students.add(new Student(4, "Tran Thi Thuy Hien", 8.9));
        students.add(new Student(5, "Le Dinh Hien", 5.9));
        students.add(new Student(6, "Nguyen Thi Sam", 4.9));

        Map<academicPerformance, List<Student>> classification = new EnumMap<>(academicPerformance.class);
        for (academicPerformance p : academicPerformance.values()) {
            classification.put(p, new ArrayList<>());
        }

        for (Student student : students) {
            if (student.getAvgScore() < 5) {
                classification.get(academicPerformance.Yeu).add(student);
            } else if (student.getAvgScore() < 6.5) {
                classification.get(academicPerformance.Trung_binh).add(student);
            } else if (student.getAvgScore() < 8) {
                classification.get(academicPerformance.Kha ).add(student);
            } else {
                classification.get(academicPerformance.Gioi).add(student);
            }
        }

        for (Map.Entry<academicPerformance, List<Student>> entry : classification.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
