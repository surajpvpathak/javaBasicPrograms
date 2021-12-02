import java.util.Scanner;

public class palindromeNumber {
 // number and its reversal is same
    public static void main(String[] args){
        int number;
        Scanner in = new Scanner((System.in));
        System.out.println("Enter Number : ");
        number = in.nextInt();

        palindrome(number);

    }

    public static void palindrome(int number){

        int rev = 0;
        int t;
        t = number;
        while(number!=0){
            int remainder  = number %10;
            rev = rev*10 + remainder;
            number = number/10;
        }
        System.out.println("the reverse is : " +rev);

        if(t == rev){
            System.out.println(t + " is palindrome number");
        }
        else{
            System.out.println(t+" Not palindrome Number");
        }
    }
}
