package HotelTest;

import Guest.Guest;
import Hotel.Hotel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Basil", 500.00);
        hotel = new Hotel("Clanty Towers");
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
        assertEquals("Basil", guest.getName());
    }

    @Test
    public void guestHasMoney() {
        assertEquals(500.00, guest.getMoney(), 0);
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
