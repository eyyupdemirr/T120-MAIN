package day11_stringManipulations;

public class C03_substring {
    public static void main(String[] args) {

        String str="Java Candir";
        System.out.println(str.substring(3));
        System.out.println(str.substring(7));
        System.out.println(str.substring(0));
       // System.out.println(str.substring(256));  StringIndexOutOfBoundsException

        System.out.println(str.substring(11));
        System.out.println(str.length());
        System.out.println(str.substring(3,7));
        System.out.println(str.substring(5,10));
        System.out.println(str.substring(1,2));
        System.out.println(str.toUpperCase().substring(6,7));
        System.out.println(str.substring(3,3));
        System.out.println(str);
       // System.out.println(str.substring(8,5));
        System.out.println(str.substring(str.length()-3));

    }
}
