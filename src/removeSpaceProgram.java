public class removeSpaceProgram {

    public static void main(String[] args){

        System.out.println(removeSpaceProgram("My Name is Suraj Pathak "));
        System.out.println(removeJunk("*******#%@#$% My Name $%#$)#%is Suraj#$@$#$#@$#@$ Pathak$$$"));
    }

    public static String removeSpaceProgram(String s){

      return s.replace(" ","");
    }

    public static String removeJunk(String s){
        //using regular expression : [^a-zA-Z0-9] --> it will remove all other than a-z . A-Z . 0-9
        return s.replaceAll("[^a-zA-Z0-9]","");
    }
}
