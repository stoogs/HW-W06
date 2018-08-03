package Room;

import Guest.Guest;

import java.util.ArrayList;

public class Conference extends Room{
    private String conferenceRoomTitle;
    //create conference room with rate 500, capacity 50, and default array and settable title.
    public Conference(int dailyRate, ArrayList<Guest> guests, int capacity, String conferenceRoomTitle) {
        super(500, guests, 50);
        this.conferenceRoomTitle = conferenceRoomTitle;
    }

    public String getConferenceRoomTitle() {
        return conferenceRoomTitle;
    }

    public void setConferenceRoomTitle(String conferenceRoomTitle) {
        this.conferenceRoomTitle = conferenceRoomTitle;
    }
}
