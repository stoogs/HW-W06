package Hotel;

import Guest.Guest;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Guest> hotelGuests;
    private ArrayList<String> results;


    public Hotel(String name) {
        this.name = name;
        hotelGuests = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int addGuestToHotel(Guest guest1){
        hotelGuests.add(guest1);
        return hotelGuests.size();
    }
    public Guest addGuestToHotelGetBackGuest(Guest guest1){
        hotelGuests.add(guest1);
        System.out.println(hotelGuests);
        return hotelGuests.get(0);
    }

    public ArrayList<String> returnGuestNameStringArray(){
        results = new ArrayList<>();
        for (Guest guest : hotelGuests){
            String temp = guest.getName();
            results.add(temp);
        }
        return results;
    }

    public ArrayList<Guest> returnGuestNameObjectArray() {
        return hotelGuests;
    }

} // class end
