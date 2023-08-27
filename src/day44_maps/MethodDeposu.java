package day44_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MethodDeposu {

    public static Map<Integer, String> ogrenciMapOlustur() {

        Map<Integer, String> ogrenciMap = new TreeMap<>();

        ogrenciMap.put(101, "Ali-Can-9-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
        ogrenciMap.put(107, "fatma-Cane-10-H-MF");
        ogrenciMap.put(108, "Sevda-Cemil-11-M-TM");
        ogrenciMap.put(109, "Sevim-Can-11-L-MF");
        ogrenciMap.put(110, "Ali-Can-12-M -MF");
        ogrenciMap.put(111, "Selim-Cok-12-M-MF");

        return ogrenciMap;
    }

    public static void isimSoyisimListesiyazdir(Map<Integer, String> ogrMap) {

        Collection<String> valueCollection = ogrMap.values();
        // System.out.println(valueCollection+"neyazacak bakalim");
        // System.out.println(valueCollection.size());
        System.out.println("Sira No,  Isim,  Soyisim");
        System.out.println("********************************");

        int siraNo = 1;

        for (String eachValue : valueCollection
        ) {
            //  eachValue.split("-");// bolme islemi ancak atama yapilincaise yarar
            String[] valuArr = eachValue.split("-");

            System.out.println(siraNo + ": " + valuArr[0] + " " + valuArr[1].toUpperCase());
            siraNo++;
        }


    }


    public static void sinifSubedekiOgrenciListesiYazdir(Map<Integer, String> ogrenciMap, int sinif, String sube) {
        //1- tum value'leri bir Collection olarak kaydedelim
        Collection<String> valueCollection = ogrenciMap.values();
        //2- bir for-each loop ile herbir value'yu ele alalim
        System.out.println(sinif + ".sinif " + sube + " subesindeki ogrenci listesi");
        System.out.println("=================================");
        for (String eachValue : valueCollection
        ) {
            //3- value'lar belirli bir ayirac ile birlestirilen String'lerden olustugu icin
            //   bu ayirac kullanilarak split() ile bir array'e donusturulebilir
            //  "Ali-Can-11-H-MF"
            String[] valueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]
            //4- artik bir array ve icerisinde value'yu olusturan bilgiler mevcut
            //   istenen bilgiyi, array'den index ile alabiliriz
            String sinifStr = sinif + "";// int sinif degerini stringlestirme
            if (valueArr[2].equals(sinifStr) && valueArr[3].equalsIgnoreCase(sube)) {
                System.out.println(valueArr[0] + " " + valueArr[1]);
            }
        }
    }

    // ogrenci map'inde verilen isim ve soyisim'e sahip ogrencilerin
    // isim , soyisim, sinif ve subelerini yazdirin
    public static void isimSoyisimIleOgrencibulma(Map<Integer, String> ogrenciMap, String ism, String soyism) {

        Collection<String> valueCoole = ogrenciMap.values();
        for (String each : valueCoole
        ) {

            String[] arr = each.split("-");// [Ali, Can, 11, H, MF]
            if (arr[0].equalsIgnoreCase(ism) && arr[1].equalsIgnoreCase(soyism)) {
                System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " ");
            }
        }
    }

    public static void numaraIleOgrenciBilgisiYazdirma(Map<Integer, String> ogrMap, int ogrNo) {

        String istenenOgrenciValue = ogrMap.get(ogrNo);

        String[] arr = istenenOgrenciValue.split("-");

        System.out.println(ogrNo + " numarali ogrenci: \n" +
                "isim, " + arr[0] +
                " soyisim, " + arr[1] +
                " sinif, " + arr[2] +
                " sube, " + arr[3]);

    }

    public static void numaraliOgrenciListesiYazdir(Map<Integer, String> ogrMap) {

        Set<Integer> ogrenciKeyset = ogrMap.keySet();  //[101, 102, 103, 104, 105, 106, 107, 108, 109] key leri gtirir

        for (Integer eachSet : ogrenciKeyset    //mesala  101,102...
        ) {
            System.out.print(eachSet + " ");
            String valueStr = ogrMap.get(eachSet);  // "Sevim-Can-11-K-MF"
            String[] arr = valueStr.split("-");// [Ali, Can, 11, H, MF]

            System.out.println(arr[0] + " " + arr[1]);


        }
    }

    public static Map<Integer, String> yilSonuSinifArttir(Map<Integer, String> ogrenciMap2) {

        //map'de bir value'yu update etmek istersek
        Set<Integer> ogrenciKeySeti = ogrenciMap2.keySet();

        for (Integer eachKey : ogrenciKeySeti    //eachKey 101,102,,,,,
        ) {
            //   1- bilgiye ulasmak icin yaptigimiz gibi adim adim value'yu array'e cevirmeliyiz
            //        - key ile value'yu cagiririz
            String eachValue = ogrenciMap2.get(eachKey);  // "Ali-Can-11-H-MF"
            //        - value'yu array'e ceviririz
            String[] valueArr = eachValue.split("-");
            //        - array'de istedigimiz update'i yapariz // [Ali, Can, 11, H, MF]

            if (valueArr[2].equals("9")){
                valueArr[2]="10";
            }
           else if (valueArr[2].equals("10")){
                valueArr[2]="11";
            }else if (valueArr[2].equals("11")){
                valueArr[2]="12";
            }else if (valueArr[2].equals("12")){
                valueArr[2]="MEZUN ";
            };

                /*
                 switch (valueArr[2]){
                case "9" :
                   valueArr[2] ="10";
                   break;
                case "10" :
                    valueArr[2] ="11";
                    break;
                case "11" :
                    valueArr[2] ="12";
                    break;
                case "12" :
                    valueArr[2] ="Mezun";
                    break;
            }
                 */


            //    2- bilgiye ulasmak icin parcaladigimiz value'yu yeni haliyle tekrar birlestiririz
            String yeniValue= valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];
            //       "Ali-Can-12-H-MF"


            //    3- key ve yeni value'yu kullanarak, map'i update ederiz

            ogrenciMap2.put(eachKey,yeniValue);


        }
        return ogrenciMap2;

    }

    public static Map<Integer, String> ogrenciBolumDegistir(Map<Integer, String> ogrenciMap3, String eskiBolum, String yeniBolum) {

        Set<Integer> ogrenciKeySet=ogrenciMap3.keySet();  //101,102,103  ,,,,,

        for (Integer herBirKey:ogrenciKeySet     // ornegin 101
             ) {
           String herBirValue= ogrenciMap3.get(herBirKey);           // "Ali-Can-11-H-MF"

            String[] valieArr=herBirValue.split("-");           //[Ali, Can, 11, H, MF]

            if (valieArr[4].equalsIgnoreCase(eskiBolum)){
              valieArr[4]=yeniBolum;                                  //[Ali, Can, 11, H, SAY]
            }

            String yeniValue=valieArr[0]+"-"+valieArr[1]+"-"+valieArr[2]+"-"+valieArr[3]+"-"+valieArr[4];   // "Ali-Can-11-H-SAY"

            ogrenciMap3.put(herBirKey,yeniValue);
        }

        return ogrenciMap3;
    }
}



 /*
        Elimizde map var
        {
        101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF
        }
        1- bizden istenen bilgiler key'de mi yoksa value'da mi ?
        [
        Ali-Can-11-H-MF,
        Veli-Cem-10-K-TM,
        Ali-Cem-11-K-TM,
        Ayse-Can-10-H-MF,
        Sevgi-Cem-11-M-TM,
        Sevgi-Can-10-K-MF
        ]
        2- value icerisindeki bilgilere rahat ulasabilmek icin
           for each loop ile her bir value'yu alip split ile array'e cevirelim
           [Ali, Can, 11, H, MF]
         3- Eger sinif ve sube parametre olarak verilen ile ayni ise
            isim ve soyismi yazdir
         */