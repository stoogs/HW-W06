package RoomTest;

import Guest.Guest;
import Room.ConferenceRoom;
import Room.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    Guest guest;
    DiningRoom diningRoom;
    ArrayList<Guest> guests;


    @Before
    public void before() {
        guest = new Guest("Basil", 500.00);
        this.guests = new ArrayList<Guest>();
        diningRoom = new DiningRoom();

    }

    @Test
    public void roomRate() {
        assertEquals(0,diningRoom.getDailyRate());
    }

    @Test  //Add to dining.Room guests array
    public void addGuestsToDiningRoomArray() {
       this.guests.add(new Guest("Dave",200)); // Works
       this.guests.add(guest); //Works
        System.out.println(guests.size());
        assertEquals(2, guests.size());
    }

    @Test // Add 2, Remove 1 from dining room array
    public void removeGuestFromDiningRoomArray(){
        this.guests.add(new Guest("Dave",200)); // Works
        this.guests.add(guest); //Works
        this.guests.remove(guest);
        assertEquals(1, guests.size());
    }
    //@Test
    //TODO check capacity of room not exceeded

}
