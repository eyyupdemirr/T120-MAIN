package day11_stringManipulations;

public class C05_startsWith_endsWith {
    public static void main(String[] args) {

        String str="Java cok guzel";
        System.out.println(str.startsWith("Java"));

        System.out.println(str.startsWith("J"));

        System.out.println(str.startsWith("Ja"));

        System.out.println(str.startsWith("Java cok guzel"));

        System.out.println(str.startsWith(""));

        System.out.println(str.startsWith("c",6));
        System.out.println(str.startsWith("ok",6));

        System.out.println(str.endsWith("el"));
        System.out.println(str.endsWith("guzel"));
        System.out.println(str.endsWith(""));
        System.out.println(str.endsWith(" "));
        System.out.println(str.endsWith("cok guzel"));



    }
}
