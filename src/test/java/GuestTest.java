import Guest.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Basil", 500.00);
    }//before

    @Test

    public void guestHasName() {
        assertEquals("Basil", guest.getName());
    }

    @Test
    public void guestHasMoney() {
        assertEquals(500.00, guest.getMoney(), 0);
    }

} // class end
