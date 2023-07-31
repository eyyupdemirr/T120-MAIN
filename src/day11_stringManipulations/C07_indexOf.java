package day11_stringManipulations;

public class C07_indexOf {
    public static void main(String[] args) {

        String str="Ali topu at,at ali at";
        System.out.println(str.indexOf("Ali"));

        System.out.println(str.indexOf("at"));

        System.out.println(str.indexOf("op  "));

        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf(" "));
        System.out.println(str.indexOf("a",10));
        System.out.println(str.indexOf("yusuf"));

        System.out.println(str.indexOf("l"));



    }
}
