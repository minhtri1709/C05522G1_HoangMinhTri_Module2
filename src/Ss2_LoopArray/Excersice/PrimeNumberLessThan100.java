package Ss2_LoopArray.Excersice;

public class PrimeNumberLessThan100 {
    public static void main(String[] args) {
        System.out.print("The prime number less than 100 is: ");

        for (int i = 0; i < 100; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            } if (check) {
                System.out.print(i + ",");
            }
        }
    }
}
