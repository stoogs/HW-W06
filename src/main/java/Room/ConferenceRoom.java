package Room;

import Guest.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room{
    private String conferenceRoomTitle;
    private ArrayList<Guest> guests;
    //create conference room with rate 500, capacity 50, and default array and settable title.
    public ConferenceRoom(String conferenceRoomTitle, ArrayList<Guest> guests) {
        super(50, 50);
        this.conferenceRoomTitle = conferenceRoomTitle;
        this.guests = new ArrayList<Guest>(); //IMPORTANT
    }

    public String getConferenceRoomTitle() {
        return conferenceRoomTitle;
    }

    public void setConferenceRoomTitle(String conferenceRoomTitle) {
        this.conferenceRoomTitle = conferenceRoomTitle;
    }
}
