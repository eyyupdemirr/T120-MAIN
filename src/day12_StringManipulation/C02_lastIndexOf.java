package day12_StringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        String str="Javayi ogrenecegiz, baska yolu yok";
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.indexOf("J"));
        System.out.println(str.lastIndexOf("J"));

        int ik=str.indexOf("J");
        int sk=str.lastIndexOf("J");
      //  System.out.println(ik==sk?"sadece birkere kulanilmis":"en az iki kere kullanilmis ");

        if (ik==-1){
            System.out.println(" hic e harfi kullanilmamis");
        }else if (ik==sk){
            System.out.println(" yalnizca bir kere kullanilmis");
        }else
            System.out.println("en az iki kere kullanilmis");


        System.out.println(str.lastIndexOf("o"));
        System.out.println(str.lastIndexOf("o",str.lastIndexOf("o")-1));

















       // System.out.println(str.indexOf("a"));
       // System.out.println(str.lastIndexOf("a"));
       // System.out.println(str.length());
       // System.out.println(str.indexOf("J"));
       // System.out.println(str.lastIndexOf("J"));
       // System.out.println(str.lastIndexOf("j"));






    }
}
