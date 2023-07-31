package day14_forLoops;

import java.util.Scanner;

public class C07_StringTerstenYazdirma {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen kelime");
        String str= scanner.nextLine();

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println("");
        String ters="";
        for (int i = str.length()-1; i >=0; i--) {
            ters=ters+str.charAt(i);

        }
        System.out.println(ters);

    }
}
