public abstract class RoomObj implements Auditory{
    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    private int room;
    private int stage;
    private int space;

    public RoomObj(int room, int stage, int space) {
        this.room = room;
        this.stage = stage;
        this.space = space;
    }

}
