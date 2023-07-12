import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        task1();// Задача 1
        task2();
        task3();
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
    }

    public static void task3 (){

    }

    public static void task4 (){

    }

}