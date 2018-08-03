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
}
