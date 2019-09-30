public class StudyClass extends RoomObj implements Auditory {

   private int seats;
   private boolean isComputer;

    public StudyClass(int room, int stage, int space, int seats, boolean isComputer) {
        super(room, stage, space);
        this.seats = seats;
        this.isComputer = isComputer;
    }

    @Override
    public int calculateCamacity() {
        return seats;
    }

    @Override
    public void printInfo() {
        System.out.println("Кабинет:" + new Integer(getRoom()).toString() + "Этаж:" + getStage()+ "Площадь:" + getSpace()
                + "Наличие компьютера:" + isComputer+ "Вместимость:" + seats );

    }
}
