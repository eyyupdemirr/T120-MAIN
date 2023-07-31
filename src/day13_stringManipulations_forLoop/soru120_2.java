package day13_stringManipulations_forLoop;

public class soru120_2 {
    public static void main(String[] args) {

        //Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        String input1=" “15.30 €”";
        String input2= "“11.40 €”";
        //String output : 26.70 €;

        input1=input1.replaceAll("\\D","");
        System.out.println(input1);
        System.out.println(5+input1);

    }
}
