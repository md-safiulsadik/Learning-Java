import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        //fruits.remove(0);
        //fruits.set(0, "Pineapple");

        Collections.sort(fruits);


        int numOfFood;
        System.out.printf("How many food you want to add? ");
        numOfFood = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < numOfFood; i++) {
            System.out.printf("Enter food no.%d: ", i+1);
            list.add(scanner.nextLine());
        }

        System.out.println("Food list: ");
        System.out.println(list);

        scanner.close();

    }
}
