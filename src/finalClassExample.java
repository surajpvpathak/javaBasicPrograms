
public class finalClassExample {

    private final int NUMBER;
    int sum;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        finalClassExample fo = new finalClassExample(10);

        for (int add = 0; add < 5; add++) {
            fo.add();
        }
        System.out.println(fo.toString());
    }

    public finalClassExample(int x) {
        NUMBER = x;
    }

    public void add() {
        sum += NUMBER;
    }

    public String toString() {
        return String.format("The sum is :  %d\n", sum);
    }

}
