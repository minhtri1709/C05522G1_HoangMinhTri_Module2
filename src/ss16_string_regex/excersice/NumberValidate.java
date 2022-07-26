package ss16_string_regex.excersice;

import java.util.Scanner;

public class NumberValidate {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            try {
                System.out.println("Input your number: ");
                String phoneNumber = scanner.nextLine();
                if (phoneNumber.matches("[(][0-9]{2}[)][-][(][0][0-9]{9}[)]")){
                    System.out.println("Your phone number: " + phoneNumber + " is valid.");
                    break;
                }else {
                    System.out.println("Please input again your number");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }while (true);
    }
}
