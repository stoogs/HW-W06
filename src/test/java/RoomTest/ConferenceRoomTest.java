package RoomTest;

import Guest.Guest;
import Room.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    ArrayList<Guest> guests;

    @Before
    public void before() {
        this.guests = new ArrayList<Guest>();
        conferenceRoom = new ConferenceRoom("Conf Room",guests);
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
        assertEquals(1, conferenceRoom.roomOccupied());
    }

    @Test
    public void testRemoveGuestFromDiningRoom(){
        conferenceRoom.addGuestToConferenceRoom();
        conferenceRoom.addGuestToConferenceRoom();
        conferenceRoom.removeGuestFromConferenceRoom();
        assertEquals(1, conferenceRoom.roomOccupied());
    }
    // @Test
    //TODO put guests in array guests

   // @Test
    //TODO check size of array guests

    //@Test
    //TODO confirm capacity of room not exceeded

    //@Test
    //TODO remove guests from room
}// class end
