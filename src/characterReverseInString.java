import java.util.Arrays;

public class characterReverseInString {

    public  void characterReverseInString(String str) {

        String[] splitArray = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < splitArray.length; i++) {
            String word = splitArray[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {

                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(str);
        System.out.println(reversedString);
    }

    public static void main(String[] args) {
        characterReverseInString obj = new characterReverseInString();
       /* obj.characterReverseInString("Welcome to BeginnersBook");
        obj.characterReverseInString("This is an easy Java Program");*/

        obj.surajMethod();
    }

    public void  surajMethod(){
        String a = "My name is TestName";
        String[] arrayOfa = a.split(" ");
        String rev = "";

        for(int i = 0 ; i<arrayOfa.length;i++){
            String word = arrayOfa[i];
            String reverseWord = "";
            for(int j=word.length()-1; j>=0; j--){
                reverseWord = reverseWord + word.charAt(j);
            }
            rev = rev + reverseWord + " ";

        }
        System.out.println(rev);
    }

}
