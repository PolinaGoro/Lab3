public abstract class Laboratory extends RoomObj implements Auditory {
    private boolean isEquipment;
    private int numberOfSeat;

    public Laboratory(int room, int stage, int space, boolean isEquipment, int numberOfSeat) {
        super(room, stage, space);
        this.isEquipment = isEquipment;
        this.numberOfSeat = numberOfSeat;
    }

    public boolean getIsEquipment() {
        return isEquipment;
    }

    public void setIsEquipment(boolean equipment) {
        isEquipment = equipment;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }
}
