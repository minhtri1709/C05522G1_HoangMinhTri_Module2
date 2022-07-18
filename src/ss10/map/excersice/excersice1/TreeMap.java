package ss10.map.excersice.excersice1;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TreeMap {
    public static void main(String[] args) {
        System.out.println("Input the word you want to put: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] array = string.toLowerCase().split(" ");

        Map<String, Integer> map = new java.util.TreeMap<>();

        for (String key : array) {
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                int count = map.get(key);
                map.put(key, count + 1);
            }
        }

        System.out.println("The word appear in string is/are\n" + string);

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.print(key + " = " + map.get(key) + " ,");
        }

    }
}


