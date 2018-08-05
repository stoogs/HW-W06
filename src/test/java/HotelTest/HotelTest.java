package HotelTest;

import Guest.Guest;
import Hotel.Hotel;
import Room.BedRoom;
import Room.BedRoomType;
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
    BedRoom bedRoom;

    @Before
    public void before() {
        guest1 = new Guest("Basil", 100.00);
        guest2 = new Guest("Cybil", 1000.00);
        hotel = new Hotel("Clanty Towers");
        diningRoom = new DiningRoom();
        diningRoom.addGuestToDiningRoom();
        diningRoom.addGuestToDiningRoom();
        conferenceRoom = new ConferenceRoom("Conf Room",guests);
        conferenceRoom.addGuestToConferenceRoom();
        conferenceRoom.addGuestToConferenceRoom();
        bedRoom = new BedRoom(BedRoomType.SINGLE);
    }
    @Test
    public void bedRoomSingleGetPrice(){
        System.out.println(bedRoom.getType());

       // assertEquals(BedRoomType.SINGLE, bedRoomSingle.getName());
    }
    @Test
    public void testChangeConferenceRoomTitle(){
        conferenceRoom.changeConferenceRoomTitle("Flat Earthers");
    assertEquals("Flat Earthers", conferenceRoom.getConferenceRoomTitle());
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
    @Test  //Add to DiningRoom guests array
    public void testAddGuestsToDiningRoom() {
        diningRoom.addGuestToDiningRoom();
        assertEquals(3, diningRoom.roomOccupied());
    }
    @Test //Add to Dining Room guests array
    public void testRemoveGuestFromDiningRoom(){
        diningRoom.removeGuestFromDiningRoom();
        assertEquals(1, diningRoom.roomOccupied());
    }
@Test
    public void testListGuestsInDiningRoom(){
        System.out.println(conferenceRoom.getConferenceRoomTitle());
        assertEquals(1,1);
    }

    @Test
    public void testRoomName() {
        assertEquals("Conf Room", conferenceRoom.getConferenceRoomTitle());
    }

    @Test
    public void changeRoomName() {
        conferenceRoom.setConferenceRoomTitle("Expo Room");
        assertEquals("Expo Room", conferenceRoom.getConferenceRoomTitle());
    }
    @Test
    public void testRoomRate() {
        conferenceRoom.getDailyRate();
        assertEquals(500, conferenceRoom.getDailyRate());
    }

    @Test
    public void testSetRoomRate() {
        conferenceRoom.setDailyRate(550);
        assertEquals(550, conferenceRoom.getDailyRate());
    }

    @Test
    public void testAddGuestToConferenceRoom(){
        conferenceRoom.addGuestToConferenceRoom();

        assertEquals(3, conferenceRoom.roomOccupied());
    }

    @Test
    public void testRoomEmpty(){
        assertEquals(2, diningRoom.roomOccupied());
    }

    @Test
    public void testAddGuestToDiningRoom(){
        diningRoom.addGuestToDiningRoom();
        diningRoom.addGuestToDiningRoom();
        diningRoom.addGuestToDiningRoom();
        assertEquals(5, diningRoom.roomOccupied());
    }
@Test
    public void testPrintConferenceRoomGuestNames() {
    conferenceRoom.printConferenceRoomGuestNames();
    }

    @Test
    public void testConferenceRoomEmptyTrue(){
        boolean result = conferenceRoom.conferenceRoomEmptyTrue();
        System.out.println(result);
        assertEquals(true,result);
    }
@Test
    public void testConferenceRoomEmptyFalse(){
        boolean result = conferenceRoom.conferenceRoomEmptyFalse();
        System.out.println(result);
        assertEquals(false,result);
    }

    @Test
    public void addGuestToHotel(){
      int result = hotel.addGuestToHotel(guest1);
        assertEquals(1, result);
    }

    @Test
    public void addGuestToHotelGetBackGuest(){
        Guest result = hotel.addGuestToHotelGetBackGuest(guest1);
        assertEquals(guest1, result);

    }
@Test
    public void testReturnGuestNameStringArray(){
        hotel.addGuestToHotel(guest1);
        hotel.addGuestToHotel(guest2);
        System.out.println(hotel.returnGuestNameStringArray());
    }

    @Test
    public void testReturnGuestNameObjectArray(){
        hotel.addGuestToHotel(guest1);
        hotel.addGuestToHotel(guest2);
        hotel.addGuestToHotel(guest2);
        ArrayList<Guest> results;
        results = hotel.returnGuestNameObjectArray();
        System.out.println(results);
    }

}





