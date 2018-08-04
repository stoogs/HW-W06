package HotelTest;

import Guest.Guest;
import Hotel.Hotel;
import Room.Bedroom;
import Room.ConferenceRoom;
import Room.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Guest guest1, guest2;
    ArrayList<Guest> guests;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;
    Bedroom bedRoomSingle, bedRoomDouble,bedRoomKing;

    @Before
    public void before() {
        guest1 = new Guest("Basil", 100.00);
        guest2 = new Guest("Cybil", 1000.00);
        hotel = new Hotel("Clanty Towers");
        diningRoom = new DiningRoom();
        this.guests = new ArrayList<Guest>();
        conferenceRoom = new ConferenceRoom("Conf Room",guests);

        // TODO make guest array
        // TODO make room array
        // put single guest in room array
        // make guest array
        // check in guest
        // check out guest
        // put guest in room array
        // remove guest from room array

    }

    @Test
    public void guestHasName() {
        assertEquals("Basil", guest1.getName());
    }

    @Test
    public void guestHasMoney() {
        assertEquals(100.00, guest1.getMoney(), 0);
    }

    @Test
    public void testHotelName() {
        assertEquals("Clanty Towers", hotel.getName());
    }
    @Test
    public void testHotelNameChange() {
        hotel.setName("Fawlty Towers");
        assertEquals("Fawlty Towers", hotel.getName());
    }

}
