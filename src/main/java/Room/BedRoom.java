package Room;

public class BedRoom extends Room{
    private BedRoomType type;

    public BedRoom(BedRoomType type) {
       super(50,1);
        this.type = type;
    }

    public BedRoomType getType() {
        return type;
    }

}
