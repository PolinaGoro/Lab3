import java.util.LinkedList;

public class Main {
    public static void main(String [] argv)
    {
        LinkedList <RoomObj> university = new LinkedList<>();
        university.add(new StudyClass(100, 1, 10, 15, true));
        university.add(new StudyClass(101, 1, 10, 10, false));
        university.add(new StudyClass(102, 1, 20, 30, true));
        university.add(new LectureAuditory(200, 2, 40, 5, 10, true));
        university.add(new LectureAuditory(201, 2, 50, 6, 20, false));
        university.add(new LectureAuditory(202, 2, 30, 3, 5, true));
        university.add(new ComputerLab(301, 3, 30, true, 15, "Комьютеры, Лэптопы, Маршрутизаторы"));
        university.add(new ChemistryLab(302, 3, 30, true, 25, "Колбы, Смеситель, Ложки, Диэлектрик"));

        for(RoomObj a : university)
        {
            a.printInfo();
        }
    }
}
