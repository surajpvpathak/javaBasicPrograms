public class ThreadMainClass {

    public static void main(String[] args){
        Thread t1 = new Thread( new ThreadExample("one"));
        Thread t2 = new Thread( new ThreadExample("two"));
        Thread t3 = new Thread( new ThreadExample("three"));
        t1.start();
        t2.start();
        t3.start();

    }
}
