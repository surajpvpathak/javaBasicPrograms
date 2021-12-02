import java.util.Scanner;

public class primeNumberProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = scan.nextInt();

        int m = 0;
        int flag = 0;

        m = number / 2;

        if (number == 0 || number == 1) {
            System.out.println("Number is not prime");
        } else
            for (int i = 2; i < m; i++) {
                if (number % i == 0) {
                    System.out.println("Number is not prime");
                    flag = 1;
                    break;
                }
            }
        if (flag == 0) {
            System.out.println(number + " is prime number");
        }
    }

    }

