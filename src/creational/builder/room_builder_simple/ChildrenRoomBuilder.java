package creational.builder.room_builder_simple;

public class ChildrenRoomBuilder implements RoomBuilder{
    private int ceilingHeight;
    private int floorNumber;
    private int numberOfWindows;
    private int squareMeters;
    private String pointOfCompass;
    private int numberOfBeds;
    private int numberOfDesks;

    @Override
    public ChildrenRoomBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    @Override
    public ChildrenRoomBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    @Override
    public ChildrenRoomBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    @Override
    public ChildrenRoomBuilder setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
        return this;
    }

    @Override
    public ChildrenRoomBuilder setPointOfCompass(String pointOfCompass) {
        this.pointOfCompass = pointOfCompass;
        return this;
    }

    public ChildrenRoomBuilder setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
        return this;
    }

    public ChildrenRoomBuilder setNumberOfDesks(int numberOfDesks) {
        this.numberOfDesks = numberOfDesks;
        return this;
    }

    public ChildrenRoom createChildrenRoom() {
        return new ChildrenRoom(ceilingHeight, floorNumber, numberOfWindows,
                squareMeters, pointOfCompass, numberOfBeds, numberOfDesks);
    }
}
