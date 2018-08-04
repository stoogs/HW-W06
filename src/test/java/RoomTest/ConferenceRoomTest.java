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

   // @Test
    //TODO put guests in array guests

   // @Test
    //TODO check size of array guests

    //@Test
    //TODO confirm capacity of room not exceeded

    //@Test
    //TODO remove guests from room
}// class end
