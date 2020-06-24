package creational.builder.house_builder_complex;

import creational.builder.room_builder_simple.RoomBuilder;

public class KitchenBuilder implements RoomBuilder {
    private int ceilingHeight;
    private int floorNumber;
    private int numberOfWindows;
    private int squareMeters;
    private String pointOfCompass;
    private boolean hasDiningArea;
    private boolean isStudio;
    private RoomListBuilder roomListBuilder;

    public KitchenBuilder() {
    }

    public KitchenBuilder(RoomListBuilder roomListBuilder) {
        this.roomListBuilder = roomListBuilder;
    }

    @Override
    public KitchenBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    @Override
    public KitchenBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    @Override
    public KitchenBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    @Override
    public KitchenBuilder setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
        return this;
    }

    @Override
    public KitchenBuilder setPointOfCompass(String pointOfCompass) {
        this.pointOfCompass = pointOfCompass;
        return this;
    }

    public KitchenBuilder setHasDiningArea(boolean hasDiningArea) {
        this.hasDiningArea = hasDiningArea;
        return this;
    }

    public KitchenBuilder setIsStudio(boolean isStudio) {
        this.isStudio = isStudio;
        return this;
    }

    public Kitchen createKitchen() {
        return new Kitchen(ceilingHeight, floorNumber, numberOfWindows, squareMeters,
                pointOfCompass, hasDiningArea, isStudio);
    }

    public RoomListBuilder addRoomToList() {
        Kitchen kitchen = createKitchen();
        this.roomListBuilder.addRoom(kitchen);
        return this.roomListBuilder;
    }
}
