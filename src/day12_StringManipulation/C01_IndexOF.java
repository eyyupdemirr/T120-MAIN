package day12_StringManipulation;

public class C01_IndexOF {
    public static void main(String[] args) {

        String str="at Ali topu, topu t ali";

        System.out.println(str.indexOf("top"));

        int top=str.indexOf("top");

        System.out.println(str.indexOf("top",top+1));

        System.out.println(str.indexOf("at"));
        int ilkk=str.indexOf("at");
        System.out.println(str.indexOf("at",ilkk+1));

        System.out.println("yeni soru");
        if (ilkk<0){
            System.out.println("hic kullanilmamis");
        } else if (str.indexOf("at",ilkk+1)>0) {
            System.out.println("en az Iki kere kullanilmis");
        }else
            System.out.println("yalniz birkere kullanilmis");


        //System.out.println(str.indexOf("top"));

       //System.out.println(str.indexOf("top",5));

       //System.out.println(str.indexOf("top",
       //        str.indexOf("top")+1));
       //System.out.println(str.indexOf("at"));
       //System.out.println(str.indexOf("at",
       //        str.indexOf("at")+1));
       //System.out.println("ffff");

       //System.out.println
       //        (str.indexOf("top",str.indexOf("top")+1));






    }
}
