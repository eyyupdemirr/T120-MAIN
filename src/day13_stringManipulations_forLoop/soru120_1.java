package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class soru120_1 {
    public static void main(String[] args) {

        //: Kullanicidan bir cumle alin
        //- cumlede ev geciyorsa, "home home sweet home" yazdirin
        //- cumlede is geciyorsa, "calismak guzeldir"
        //- ikisini de iceriyorsa "Hem ev lazim hem is"
        //- hicbirini icermiyorsa "cok calisman lazim" yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen cumle giriniz");
        String gircumle=scanner.nextLine();

        if ((gircumle.contains("ev")&&(gircumle.contains("is")))){
            System.out.println("Hem ev lazim hem is");
        } else if (gircumle.contains("is")) {
            System.out.println("calismak guzeldir");
        } else if (gircumle.contains("ev")) {
            System.out.println("home home sweet home");
        }else System.out.println("cok calisman lazim");


    }
}
