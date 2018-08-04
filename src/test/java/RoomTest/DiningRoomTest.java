package RoomTest;

import Guest.Guest;
import Room.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
     Guest guest1;
     DiningRoom diningRoom;

    @Before
    public void before() {
        guest1 = new Guest("Basil", 500.00);
        diningRoom = new DiningRoom();
    }

    @Test
    public void testRoomRate() {
        assertEquals(0,diningRoom.getDailyRate());
    }

    @Test
    public void testRoomEmpty(){
        assertEquals(0, diningRoom.roomOccupied());
    }

    @Test
    public void testAddGuestToDiningRoom(){
        diningRoom.addGuestToDiningRoom();
        diningRoom.addGuestToDiningRoom();
        diningRoom.addGuestToDiningRoom();
       assertEquals(3, diningRoom.roomOccupied());
    }

    @Test
    public void testRemoveGuestFromDiningRoom(){
        diningRoom.addGuestToDiningRoom();
        diningRoom.addGuestToDiningRoom();
        diningRoom.addGuestToDiningRoom();
        diningRoom.removeGuestFromDiningRoom();
        assertEquals(2, diningRoom.roomOccupied());
    }


//    @Test  //Add to dining.Room diningRoomGuestsArray array
//    public void addGuestsToDiningRoomArray() {
////       this.diningRoomGuestsArray.add(new Guest("Dave",200)); // Works
////       this.diningRoomGuestsArray.add(guest1); //Works
//        addGuestsToDiningRoomArray(Guest guest1);
//        System.out.println(diningRoomGuestsArray.size());
//        assertEquals(2, diningRoomGuestsArray.size());
//    }

//    @Test // Add 2, Remove 1 from dining room array
//    public void removeGuestFromDiningRoomArray(){
////        this.diningRoomGuestsArray.add(new Guest("Dave",200)); // Works
//        addGuestToDiningRoom(guest1); //Works
//        this.diningRoomGuestsArray.remove(guest1);
//        assertEquals(1, diningRoomGuestsArray.size());
//    }
    //@Test
    //TODO check capacity of room not exceeded

}
