package RoomTest;

import Guest.Guest;
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
        diningRoom = new DiningRoom(100, guests, 10);

    }

    @Test
    public void roomRate() {
        assertEquals(100,diningRoom.getDailyRate());
    }

    @Test  //Add to dining.Room guests array
    public void addGuestsToDiningRoomArray() {
       this.guests.add(new Guest("Dave",200)); // Works
       this.guests.add(guest); //Works
        System.out.println(guests.size());
        assertEquals(2, guests.size());
    }

    @Test // Remove guest from dining room array
    public void removeGuestFromDiningRoomArray(){
        this.guests.add(new Guest("Dave",200)); // Works
        this.guests.add(guest); //Works
        this.guests.remove(guest);
        assertEquals(1, guests.size());
    }
}
