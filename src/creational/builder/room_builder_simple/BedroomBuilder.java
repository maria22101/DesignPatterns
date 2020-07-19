package creational.builder.room_builder_simple;

public class BedroomBuilder implements RoomBuilder{
    private int ceilingHeight;
    private int floorNumber;
    private int numberOfWindows;
    private int squareMeters;
    private String pointOfCompass;
    private boolean isDouble;
    private boolean hasBathroom;

    @Override
    public BedroomBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    @Override
    public BedroomBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    @Override
    public BedroomBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    @Override
    public BedroomBuilder setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
        return this;
    }

    @Override
    public BedroomBuilder setPointOfCompass(String pointOfCompass) {
        this.pointOfCompass = pointOfCompass;
        return this;
    }

    public BedroomBuilder setIsDouble(boolean isDouble) {
        this.isDouble = isDouble;
        return this;
    }

    public BedroomBuilder setHasBathroom(boolean hasBathroom) {
        this.hasBathroom = hasBathroom;
        return this;
    }

    public Bedroom createBedroom() {
        return new Bedroom(ceilingHeight, floorNumber, numberOfWindows,
                squareMeters, pointOfCompass, isDouble, hasBathroom);
    }
}
