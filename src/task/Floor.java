package task;

public class Floor {

    private final int floor;
    private final Flat[] flats;

    public Floor(int floor, Flat[] flats) {
        this.floor = floor;
        this.flats = flats;
    }

    public void print() {
        System.out.println("Этаж: " + floor + ", кол-во квартир: " + flats.length);
        for (Flat flats : flats) {
            flats.print();

        }
    }

}
