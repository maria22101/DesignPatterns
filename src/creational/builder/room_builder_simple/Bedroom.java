package creational.builder.room_builder_simple;

public class Bedroom {
    private int ceilingHeight;
    private int floorNumber;
    private int numberOfWindows;
    private int squareMeters;
    private String pointOfCompass;
    private boolean isDouble;
    private boolean hasBathroom;

    public Bedroom(int ceilingHeight,
                   int floorNumber,
                   int numberOfWindows,
                   int squareMeters,
                   String pointOfCompass,
                   boolean isDouble,
                   boolean hasBathroom) {
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.numberOfWindows = numberOfWindows;
        this.squareMeters = squareMeters;
        this.pointOfCompass = pointOfCompass;
        this.isDouble = isDouble;
        this.hasBathroom = hasBathroom;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "ceilingHeight=" + ceilingHeight +
                ", floorNumber=" + floorNumber +
                ", numberOfWindows=" + numberOfWindows +
                ", squareMeters=" + squareMeters +
                ", pointOfCompass='" + pointOfCompass + '\'' +
                ", isDouble=" + isDouble +
                ", hasBathroom=" + hasBathroom +
                '}';
    }
}
