package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        System.out.println("Lutfen isminizi giriniz.");

        String girilrnIsim= scanner.next();

        System.out.println("Lutfen soy isminizi giriniz.");

        String girilrnSoyIsim= scanner.next();

        System.out.println("Lutfen yasinizi giriniz.");

        int girilrnYas=scanner.nextInt();

        /*System.out.println("Isminiz  "+girilrnIsim);
        System.out.println("Soy isminiz "+girilrnSoyIsim);
        System.out.println("Yasiniz  "+girilrnYas);
        System.out.println("Kaydiniz basari ile tamamlanmistir.");*/

        System.out.println("Isminiz  "+girilrnIsim+
                "\nSoyisminiz "+girilrnSoyIsim+
                "\nYasiniz  "+girilrnYas
                +"\nKaydiniz basari ile tamamlanmistir.");















    }
}
