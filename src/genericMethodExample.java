public class genericMethodExample {

    public static void main (String[] args){
//    Generic methods are useful to eliminate overloaded methods
        String[] str = {"spt","ABC","xyz"};
        Integer[] inte = {2,3,4,5};

        // now we have two different data types arrays , and we want to print both the arrays , so we will use one printMe method

        //in general without generic method we need to develop printMe for string array and overload it for int array and keep doing this for all data types , so instead of it , we will define one generic method
        printMe(str);
        printMe(inte);

        System.out.println("Use comparison with generic methods and return the max value :  ");
        System.out.println(max(20,10,11));
        System.out.println(max("suraj","apple","zebra"));



    }

    private static <T> void printMe(T[] x){
        for (T a : x) {
            System.out.printf("%s ", a);
            System.out.println();
        }
    }

    //lest see how we can compare the different data types using genreric data type for this comparison we cant use greater Than functions directly as comparison can be with strings/char etc

    //let build one method for this max

    public static <T extends Comparable<T>> T max(T a , T b , T c){

        //<T extends Comparable<T>> : only objects inheritated from Comparable class  can be used in this method

        T m = a ;
        if(b.compareTo(a) > 0)
            m=b;
        if(c.compareTo(b) > 0)
            m=c;
        return m;
    }
}
