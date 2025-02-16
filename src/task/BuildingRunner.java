package task;

public class BuildingRunner {
    private static final int BUILDING_NUMBER = 19;

    private static final int FLOOR_NUMBER_1 = 1;
    private static final int FLOOR_NUMBER_2 = 2;

    private static final int FLAT_1 = 1;
    private static final int FLAT_2 = 2;
    private static final int FLAT_3 = 3;
    private static final int FLAT_4 = 4;
    private static final int FLAT_5 = 5;
    private static final int FLAT_6 = 6;


    public static void main(String[] args) {
        // комнаты
        Room room1 = new Room(false);
        Room room2 = new Room(false);
        Room room3 = new Room(true);  // комната 3 - проходная  ---  мое проедположение

        // квартиры
        Flat flat1 = new Flat(FLAT_3, new Room[]{room1});
        Flat flat2 = new Flat(FLAT_2, new Room[]{room1, room2});
        Flat flat3 = new Flat(FLAT_1, new Room[]{room1, room2, room3});
        Flat flat4 = new Flat(FLAT_4, new Room[]{room1, room2});
        Flat flat5 = new Flat(FLAT_5, new Room[]{room1});
        Flat flat6 = new Flat(FLAT_6, new Room[]{room1, room2, room3});


        // этаж c квартирами
        Floor floor1 = new Floor(FLOOR_NUMBER_1, new Flat[]{flat1, flat2, flat3});
        Floor floor2 = new Floor(FLOOR_NUMBER_2, new Flat[]{flat4, flat5, flat6});
        // Массив этажей
        Floor[] floors = new Floor[]{floor1, floor2};

        // здание
        Building building = new Building(BUILDING_NUMBER, floors);

        //  о здании целиком
        building.printAllInformation();

    }


}
