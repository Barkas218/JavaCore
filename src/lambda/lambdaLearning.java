package lambda;

import src.lambda.Option1.HotelPriceHigher2000;
import src.lambda.Option2.FilterCondtionAnonymous;

import java.util.function.Predicate;

public class lambdaLearning {

    public static void startLearning(){

        System.out.println("Lambda is the idea of passing around functions");

        HotelService hotelService = new HotelService();

        // Hotel 1
        System.out.println("------------------- Interface -------------");
        HotelPriceHigher2000 hotelPriceHigher2000 = new HotelPriceHigher2000();
        hotelService.showfilteredHotelsOption1(hotelPriceHigher2000);

        // Hotel 2
        System.out.println("------------------- Anonymous -------------");
        hotelService.showfilteredHotelsOption2(new FilterCondtionAnonymous(){
            @Override
            public boolean test(Hotel hotel) {
                return hotel.getPrice() > 2000;
            }
        });

        // Hotel 3
        System.out.println("------------------- Lambdas -------------");
        Predicate<Hotel> filter = (hotel)->hotel.getPrice()>2000;
        hotelService.showfilteredHotelsOption3(filter);

    }

}
