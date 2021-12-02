import java.util.Scanner;

public class armstrongNumber {
    //armstrong number = cuber of each digits sum = the number

    //153 --> 1  cube  + 5 cuber + 3 cube = the number(153)
    //1*1*1 = 1
    //5*5*5 = 125
    //3*3*3 = 27
    //1+125+27 = 153
    public static void main(String[] args){
        int number;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number: ");
        number = scn.nextInt();
        isArmstrongNumber(number);
    }

    public static void isArmstrongNumber(int num){
    int t;
    int cube = 0 ;
    t=num;
    while (num >0){
        int r = num%10;
        num = num /10;
        cube = cube + (r*r*r);
    }
    if(t==cube){
        System.out.println(t+ " Armstrong Number");
    }
    else{
        System.out.println(t+ " Not Armstrong Number");
    }
    }
}
