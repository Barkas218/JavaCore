package lambda;

import src.lambda.Option1.FIlterContition;
import src.lambda.Option2.FilterCondtionAnonymous;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HotelService {

    private List<Hotel> hotels = new ArrayList<>();

    public HotelService(){
        hotels.add(new Hotel(1000,HotelType.ThreeStar));
        hotels.add(new Hotel(2000,HotelType.FiveStar));
        hotels.add(new Hotel(5000,HotelType.FiveStar));
        hotels.add(new Hotel(2000,HotelType.FourStar));
        hotels.add(new Hotel(3000,HotelType.FiveStar));
        hotels.add(new Hotel(1000,HotelType.ThreeStar));
    }

    // pass filtercondition --> we can pass around a function in order to filter
    // The way to do this is using an interface
        // Option 1: create class file (  + interface (Filtercondition)
        // Option 2: interface + use abtractclass
        // Option 3: lambda expression ( pre-built: interface)
    public void showfilteredHotelsOption1(FIlterContition fIlterContition){
        for(var hotel:hotels) {
            // filtercondition
            if (fIlterContition.test(hotel)) {
                System.out.println(hotel);
            }
        }
    }

    public void showfilteredHotelsOption2(FilterCondtionAnonymous filterCondtionAnonymous){
        for(var hotel:hotels) {
            // filtercondition
            if (filterCondtionAnonymous.test(hotel)) {
                System.out.println(hotel);
            }
        }
    }

    public void showfilteredHotelsOption3(Predicate<Hotel> filterPredicate){
        for(var hotel:hotels) {
            // filtercondition
            if (filterPredicate.test(hotel)) {
                System.out.println(hotel);
            }
        }
    }

}
