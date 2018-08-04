package Room;

import Guest.Guest;

import java.util.ArrayList;

public abstract class Room {
    private int dailyRate;
    //private ArrayList<Guest> guests;
    private int capacity;

    public Room(int dailyRate, int capacity){
        this.dailyRate = dailyRate;
        //this.guests = new ArrayList<Guest>(); //IMPORTANT
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }

//    public ArrayList<Guest> getGuests() {
//        return guests;
//    }
//
//    public void setGuests(ArrayList<Guest> guests) {
//        this.guests = guests;
//    }
//
//    public void addGuest(Guest guest){
//        guests.add(guest);
//    }


// put guest in room


}// class end
