package creational.builder.house_builder_complex;

public class Room {
    private int ceilingHeight;
    private int floorNumber;
    private int numberOfWindows;
    private int squareMeters;
    private String pointOfCompass;

    public Room(int ceilingHeight, int floorNumber, int numberOfWindows, int squareMeters, String pointOfCompass) {
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.numberOfWindows = numberOfWindows;
        this.squareMeters = squareMeters;
        this.pointOfCompass = pointOfCompass;
    }
}
