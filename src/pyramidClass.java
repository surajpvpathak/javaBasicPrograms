public class pyramidClass {

    public static void main(String[] args) {
        pyramidClass(10);
        System.out.println();
        System.out.println("reverse");
      //  pyramidClassReverse(5);
    }


    public static void pyramidClass(int n) {
        for (int i = 0; i < 5; i=i+2) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }





   /* public static void pyramidClassReverse(int n) {
        for (int i =n; i >= 0; i--) {
            for (int j = i; j >=0; j--) {
                System.out.print("$ ");
            }
            System.out.println();
        }*/
 //   }
}
