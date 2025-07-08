import java.util.*;

public class Characters {
    public static Map<Character, Integer> characterMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot chuoi ki tu bat ki:");

        countAppearTimes(scanner);
        sortAppearTimesDESC();
        displayAppearTimes();
    }

    public static void countAppearTimes(Scanner scanner) {
        String characters = scanner.nextLine();
        for (int i = 0; i < characters.length(); i++) {
            char character = characters.charAt(i);
            if (characterMap.containsKey(character)) {
                characterMap.put(character, characterMap.get(character) + 1);
            } else {
                characterMap.put(character, 1);
            }
        }
    }

    public static void displayAppearTimes() {
        System.out.println("Số lần xuất hiện của từng ký tự (giảm dần):");
        for (Character character : characterMap.keySet()) {
            System.out.println(character + ": " + characterMap.get(character));
        }
    }


    public static void sortAppearTimesDESC() {
        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(characterMap.entrySet());
        sortedList.sort(Map.Entry.<Character, Integer>comparingByValue().reversed());

        characterMap.clear();
        for (Map.Entry<Character, Integer> entry : sortedList) {
            characterMap.put(entry.getKey(), entry.getValue());
        }
    }

}
