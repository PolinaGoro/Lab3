public class LectureAuditory extends RoomObj implements Auditory {

    private int rows;
    private int seatsinrow;
    private boolean isProjector;

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getSeatsinrow() {
        return seatsinrow;
    }

    public void setSeatsinrow(int seatsinrow) {
        this.seatsinrow = seatsinrow;
    }

    public boolean isProjector() {
        return isProjector;
    }

    public void setProjector(boolean projector) {
        isProjector = projector;
    }

    public LectureAuditory(int room, int stage, int space, int rows, int seatsinrow, boolean isProjector) {
        super(room, stage, space);
        this.rows = rows;
        this.seatsinrow = seatsinrow;
        this.isProjector = isProjector;
    }

    @Override
    public int calculateCamacity() {
        return rows * seatsinrow;
    }

    @Override
    public void printInfo() {
        System.out.println("Кабинет:" + new Integer(getRoom()).toString() + "Этаж:" + getStage()+ "Площадь:" + getSpace()
                + "Наличие проектора:" + isProjector + "Вместимость:" + seatsinrow* rows);

    }
}
