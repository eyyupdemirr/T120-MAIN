package day10_SwitchCase_StringManipulations;

import java.util.Locale;

public class C04_toUpperCase_toLoverCase {
    public static void main(String[] args) {

        String str="Java Candır";
        System.out.println(str);
        System.out.println(str.toUpperCase());


        System.out.println("hhhh");
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));

    }
}
