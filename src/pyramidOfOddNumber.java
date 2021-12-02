public class pyramidOfOddNumber {

    public static void main(String[] args) {
        pyramidOfOddNumber(19);
        actualPyramid(5);
    }

    public static void pyramidOfOddNumber(int n) {

        int m = n % 2;
        if (m == 0) {
            System.out.println("Not Odd Number");
        } else
            System.out.println("Odd Number");
    }

    public static void actualPyramid(int n) {
        int m = n % 2;
        int total=0;
        if (m != 0) {
            do {
                for (int i = 0; i <= n; i++) {
                    for (int j = 0; j <= i; j++) {


                        System.out.print(n + " ");
                        total++;

                    }
                    System.out.println();
                }
            }while(total<10);
        } else {
            System.out.println("no run");
        }
    }
}
