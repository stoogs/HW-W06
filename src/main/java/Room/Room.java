package Room;

import Guest.Guest;

import java.util.ArrayList;

public abstract class Room {
    private int dailyRate;
    private ArrayList<Guest> guests;
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }

}// class end
