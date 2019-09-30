public class ChemistryLab extends Laboratory {

    private String equipment;

    public ChemistryLab(int room, int stage, int space, boolean isEquipment, int numberOfSeat, String equipment) {
        super(room, stage, space, isEquipment, numberOfSeat);
        this.equipment = equipment;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    @Override
    public int calculateCamacity() {
        return getNumberOfSeat();

    }

    @Override
    public void printInfo() {
        System.out.println("Кабинет:" + new Integer(getRoom()).toString() + "Этаж:" + getStage()+ "Площадь:" + getSpace()
                + "Наличие оборудования:" + getIsEquipment()+ "Вместимость:" + getNumberOfSeat() + "Вид оборудования:" + getEquipment() );
    }
}
