package lambda;

public class Hotel {

    private Integer price;
    private HotelType hotelType;

    public Hotel(Integer price, HotelType hotelType) {
        this.price = price;
        this.hotelType = hotelType;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public HotelType getHotelType() {
        return hotelType;
    }

    public void setHotelType(HotelType hotelType) {
        this.hotelType = hotelType;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "price=" + price +
                ", hotelType=" + hotelType +
                '}';
    }
}
