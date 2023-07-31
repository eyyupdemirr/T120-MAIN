package day13_stringManipulations_forLoop;

public class soru120_3 {
    public static void main(String[] args) {
        //Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        //sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        //input : java1 ogRe2@nMek3 #ne +Gu=zel
        //output : Java ogrenmek ne guzel.

        String input="java1 ogRe2@nMek3 #ne +Gu=zel";

        input=input.replaceAll("\\d","");
        System.out.println(input);

        input=input.replaceAll("\\s","9");
        System.out.println(input);

        input=input.toLowerCase();
        System.out.println(input);

        input=input.replaceAll("\\W","");
        System.out.println(input);

        input=input.replaceAll("\\d"," ");
        System.out.println(input);

        input=input.substring(0,1).toUpperCase()+input.substring(1).toLowerCase();
        System.out.println(input);

        // asagidaki iki secenekte bulaamadim  googldan  buldum

      //  input=input.substring(0,1).toUpperCase();
       // System.out.println(input);

       // input=input.replaceFirst("j","J");
        //System.out.println(input);

        input=input+".";
        System.out.println(input);



    }
}
