package day13_stringManipulations_forLoop;

public class C02_ReplaceAll {
    public static void main(String[] args) {

        String str="1Ja4va 8C9a2n5d1i1r.";
        System.out.println(str);
        System.out.println(str.replace("1",""));

        str=str.replaceAll("\\d","");
        System.out.println(str);






       //String str="1Ja4va 8C9a2n5d1i1r.";
       //System.out.println("1Ja4va 8C9a2n5d1i1r.");


    }
}
