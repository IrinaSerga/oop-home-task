package task;

public class Flat {

    private final int flatNumber;
    private final Room[] rooms;

    public Flat(int flat, Room[] rooms) {
        this.flatNumber = flat;
        this.rooms = rooms;
    }


    public void print() {
        System.out.println("Номер квартиры: " + flatNumber + ", кол-во комнат: " + rooms.length);
        for (Room room : rooms) {
            room.print();
        }
    }

}


