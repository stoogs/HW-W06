package Room;

import Guest.Guest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

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
    //System.out.println(Arrays.asList(diningRoomGuestsArray));
}

    public void removeGuestFromDiningRoom(){
        this.diningRoomGuestsArray.remove(guest);
        //System.out.println(diningRoomGuestsArray);
    }
public void guestsInDiningRoom(){
    //System.out.println(Arrays.toString(this.diningRoomGuestsArray.toArray()));
    System.out.println("Dining Room Guests ");
    System.out.println(Arrays.toString(this.diningRoomGuestsArray.toArray()));
}




//    public String[] getDiningRoomGuestList() {
//        int i = 0;
//        int max = diningRoomGuestsArray.size();
//        System.out.println(max);
//        for (i = 0; i < max; i++) {
//            String[] namesarray = new String[max];
//            Guest guestname = diningRoomGuestsArray.get(i);
//            namesarray[i] = guestname.getName();
//            System.out.println(guestname.getName());
//            System.out.println(namesarray[i]);
//
//        }
//        return namesarray[];
//    }

} // class end
