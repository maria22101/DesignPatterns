package creational.builder.room_builder;

public class ChildrenRoom {
    private int ceilingHeight;
    private int floorNumber;
    private int numberOfWindows;
    private int squareMeters;
    private String pointOfCompass;
    private int numberOfBeds;
    private int numberOfDesks;

    public ChildrenRoom(int ceilingHeight,
                        int floorNumber,
                        int numberOfWindows,
                        int squareMeters,
                        String pointOfCompass,
                        int numberOfBeds,
                        int numberOfDesks) {
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.numberOfWindows = numberOfWindows;
        this.squareMeters = squareMeters;
        this.pointOfCompass = pointOfCompass;
        this.numberOfBeds = numberOfBeds;
        this.numberOfDesks = numberOfDesks;
    }

    @Override
    public String toString() {
        return "ChildrenRoom{" +
                "ceilingHeight=" + ceilingHeight +
                ", floorNumber=" + floorNumber +
                ", numberOfWindows=" + numberOfWindows +
                ", squareMeters=" + squareMeters +
                ", pointOfCompass='" + pointOfCompass + '\'' +
                ", numberOfBeds=" + numberOfBeds +
                ", numberOfDesks=" + numberOfDesks +
                '}';
    }
}
