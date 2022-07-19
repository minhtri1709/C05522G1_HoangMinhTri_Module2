package ss11_algorithmSearching.excersice.excersice1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào một chuỗi:  ");
        String string = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list;
        for (int i = 0; i < string.length(); i++) {

            list = new LinkedList<>();
            list.add(string.charAt(i));

            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character character : max) {
            System.out.print(character);
        }
    }

}
