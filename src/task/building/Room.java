package task.building;

public class Room {

    // проходная ли комната
    private final boolean isWalkThrough;

    public Room(boolean isWalkThrough) {
        this.isWalkThrough = isWalkThrough;
    }

     public void print() {
         System.out.println("Комната " + (isWalkThrough ? "Проходная" : "Непроходная"));
    }




}
