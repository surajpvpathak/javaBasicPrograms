import java.util.Scanner;

 public class demoClass {
    public static void main(String[] args) {

        String str = "My name is TestName";

        // yM eman si emaNtseT


        String rev = "";
       // for(int i = str.length()-1;i>=0;i--){
        for(int i = 0;i<str.length();i++){
            for(int j = 1 ; j<str.length() ; j++) {
                rev = rev + str.charAt(j);
            }
        }
        System.out.println(rev);

        }



    }


