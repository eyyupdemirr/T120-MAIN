package day13_stringManipulations_forLoop;

public class C04_ReplaceFirst {
    public static void main(String[] args) {
        String str="Java Ca1ndir.1230";
        System.out.println(str.replaceFirst("a","A"));
        System.out.println(str.replaceFirst(" ","                                             "));

        System.out.println(str.replaceFirst("\\d"," "));
        System.out.println(str.replaceFirst("\\W","* "));

        System.out.println(str.repeat(9));




    }
}
