package Room;

import Guest.Guest;

import java.util.ArrayList;


public class DiningRoom extends Room {
    private ArrayList<Guest> diningRoomGuestsArray;
    private Guest guest;

    public DiningRoom() {
        super(0, 100);
        this.diningRoomGuestsArray = new ArrayList<Guest>();
    }


public int roomOccupied(){
        return this.diningRoomGuestsArray.size();
}

public void addGuestToDiningRoom(){
        guest = new Guest("Tester",200);
        this.diningRoomGuestsArray.add(guest);
    System.out.println(diningRoomGuestsArray);
}

    public void removeGuestFromDiningRoom(){
        this.diningRoomGuestsArray.remove(guest);
        System.out.println(diningRoomGuestsArray);
    }

} // class end
