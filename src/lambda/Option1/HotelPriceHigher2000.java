package lambda.Option1;

import src.lambda.Hotel;

public class HotelPriceHigher2000 implements FIlterContition {

    @Override
    public boolean test(Hotel hotel) {
        return hotel.getPrice() > 2000;
    }
}
