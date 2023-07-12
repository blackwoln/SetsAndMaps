import java.util.*;

public class Main {

    public static void main(String[] args) {
        task1();// Задача 1
        task2();// Задача 2
        task3();// Задача 3
        task4();
    }

    public static void task1 (){
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void task2 (){
        System.out.println("Задача 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> uniqueEvenNumbers = new HashSet<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                uniqueEvenNumbers.add(num);
            }
        }

        List<Integer> sortedEvenNumbers = new ArrayList<>(uniqueEvenNumbers);
        sortedEvenNumbers.sort(Integer::compareTo);

        for (int num : sortedEvenNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task3 (){
        System.out.println("Задача 3");
        List<String> words = new ArrayList<>(List.of("сила", "слава", "сила", "моль", "слава", "ветер", "ветер"));

        Set<String> uniqueWords = new HashSet<>(words);

        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task4 (){
        System.out.println("Задача 4");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : strings) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        for (int count : wordCounts.values()) {
            System.out.println(count);
        }
    }

}