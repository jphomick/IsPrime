import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numberToCheck = read.nextInt();
        read.close();

        int check = 0;
        boolean isPrime = true;
        for (int i = 2; i < numberToCheck; i++) {
            check = numberToCheck % i;
            if (check == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(numberToCheck + " is prime!");
        } else {
            System.out.println(numberToCheck + " is not prime!");
        }
    }
}
