package day46_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C05_NestedMap {
    public static void main(String[] args) {

          /*
         {
            "firstname" : "Ahmet",
            "lastname" : "Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2023-07-21",
                   "checkout" : "2023-08-10"
                      },
            "additionalneeds" : "wi-fi" }
         */

        Map<String,Object> booking=new HashMap<>();   //   Ana Map

        Map<String,String> innerMap=new HashMap<>();
        innerMap.put("checkin","2023-07-21");
        innerMap.put("checkout" , "2023-08-10");

        booking.put("firstname" , "Ahmet");
        booking.put("lastname" , "Bulut");
        booking.put( "totalprice" , 500);
        booking.put("depositpaid" , false);
        booking.put("additionalneeds" , "wi-fi" );

        booking.put( "bookingdates",innerMap);        //   Inner MAp ekleme


        System.out.println(booking);

        System.out.println(booking.get("firstname"));
        System.out.println(booking.get("totalprice"));

       // System.out.println(((Map) (booking.get("bookingdates"))).get("checkout"));

        System.out.println(((Map) booking.get("bookingdates")).get("checkout"));
        System.out.println(((Map) booking.get("bookingdates")).get("checkin"));

    }
}
