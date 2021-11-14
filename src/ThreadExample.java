import java.util.Random;

public class ThreadExample implements Runnable {
    String name;
    int time;
    Random rt = new Random();

    public ThreadExample(String s){
        name = s;
        time= rt.nextInt(999);
    }

    public void run() {
        try {
            System.out.printf("%s is sleeping for %d\n" , name , time);
            Thread.sleep(time);
            System.out.printf("%s is done\n" , name);
        }catch(Exception e) {

        }
    }

}
