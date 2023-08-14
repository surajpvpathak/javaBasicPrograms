import java.util.Scanner;

public class primeNumberProgram {

    public static void main(String[] args) {


        System.out.println(isPrimeNumber(20));
        getPrimeNumbers(10);
        primeNumber();
    }

    public static void primeNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = scan.nextInt();

        int m = 0;
        int flag = 0;


        m = number / 2;

        if (number == 0 || number == 1) {
            System.out.println("Number is not prime");
           flag = 1;
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

    // Another Way

    public static boolean isPrimeNumber(int num){
        // edge cornet cases , 0 and 1 are not prime numbers , lowest prime number is 2 , negative are not prime numbers
        if (num<=1){
            return false;
        }

        for(int i =2;i<num;i++){
            if(num % i == 0){
                return false;
            }

        }
        return  true;

    }

    // now to print all prime numbers upto particular number

    public static void getPrimeNumbers(int num){
        System.out.println("Prime numbers upto : "+num);
        System.out.println();
        for (int i=2;i<=num;i++){
            if (isPrimeNumber(i))
                System.out.println(i + "");

        }
    }

    }

