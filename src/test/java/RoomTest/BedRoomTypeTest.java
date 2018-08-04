package RoomTest;


import Room.BedRoom;
import Room.BedRoomType;
import org.junit.Test;

public class BedRoomTypeTest {
    BedRoom bedRoom;

@Test
    public void before() {
    bedRoom = new BedRoom(BedRoomType.SINGLE);
    System.out.println(bedRoom.getType());
    System.out.println(bedRoom.getDailyRate());
    System.out.println(bedRoom.getCapacity());
    }



} // class end
