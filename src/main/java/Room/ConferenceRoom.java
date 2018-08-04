package Room;

import Guest.Guest;

import java.util.ArrayList;
import java.util.Arrays;

public class ConferenceRoom extends Room{
    private String conferenceRoomTitle;
    private ArrayList<Guest> conferenceRoomGuestsArray;
    private Guest guest;
    private String title;
    //create conference room with rate 500, capacity 50, and default array and settable title.
    public ConferenceRoom(String conferenceRoomTitle, ArrayList<Guest> guests) {
        super(500, 50);
        this.conferenceRoomTitle = conferenceRoomTitle;
        this.conferenceRoomGuestsArray = new ArrayList<Guest>(); //IMPORTANT
    }

    public String getConferenceRoomTitle() {
        return conferenceRoomTitle;
    }

    public void setConferenceRoomTitle(String conferenceRoomTitle) {
        this.conferenceRoomTitle = conferenceRoomTitle;
        //System.out.println(getConferenceRoomTitle());
    }
    public int roomOccupied(){
        return this.conferenceRoomGuestsArray.size();
    }
    public void addGuestToConferenceRoom(){
        guest = new Guest("Tester",200);
        this.conferenceRoomGuestsArray.add(guest);
    }
    public void removeGuestFromConferenceRoom(){
        this.conferenceRoomGuestsArray.remove(guest);
    }
    public void changeConferenceRoomTitle(String title){
        this.setConferenceRoomTitle(title);
    }

//    public ArrayList listGuestsInDiningRoom(){
//        return conferenceRoomGuestsArray();
//    }


}
