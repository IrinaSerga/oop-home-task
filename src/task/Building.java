package task;

public class Building {

   private final int buildingNumber;
    private final Floor[] floors;


   public Building(int buildingNumber, Floor[] floors) {
        this.buildingNumber = buildingNumber;
        this.floors = floors;
    }

    public void print(){
        System.out.println("Дом: " + buildingNumber + ", кол-во этажей: " + floors.length);
        for (Floor floor : floors) {
            floor.print();
        }


   }
    // о здании целиком
    public void printAllInformation() {
        System.out.println("Информация о здании:");
        for (Floor floor : floors) {
            floor.print();  //  о каждом этаже
        }
    }
}
