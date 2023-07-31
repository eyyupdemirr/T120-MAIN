package day27_parametreliConstructor_constructorCall;

public class C03_Araba {

    String marka = "Marka belirtilmemis";
    String model="Model belirtilmemis";
    int yil=1900;
    int fiyat;
    String renk="Renk belirtilmemis";

    C03_Araba(){//bu constructori olusturuyoruz default
        // constructur ile ayni sekilde sadce gorunur

    }

    C03_Araba(String mrk,String mdl,int yl,int fyt,String rnk){
        marka = mrk;
        model = mdl;
        yil = yl;
        fiyat = fyt;
        renk = rnk;

    }



    public String toString() {
        return "Araba bilgileri ==> " +
                "marka:'" + marka + '\'' +
                ", model:'" + model + '\'' +
                ", yil:" + yil +
                ", fiyat:" + fiyat +
                ", renk:'" + renk + '\'' ;
    }


}
