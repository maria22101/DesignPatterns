package creational.builder.house_builder_complex;

import creational.builder.room_builder_simple.RoomBuilder;

public class CabinetBuilder implements RoomBuilder {
    private int ceilingHeight;
    private int floorNumber;
    private int numberOfWindows;
    private int squareMeters;
    private String pointOfCompass;
    boolean isSoundProof;
    boolean hasLibraryFurniture;
    int numberOfBooksPossibleToStore;
    private RoomListBuilder roomListBuilder;

    public CabinetBuilder() {
    }

    public CabinetBuilder(RoomListBuilder roomListBuilder) {
        this.roomListBuilder = roomListBuilder;
    }

    @Override
    public CabinetBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    @Override
    public CabinetBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    @Override
    public CabinetBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    @Override
    public CabinetBuilder setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
        return this;
    }

    @Override
    public CabinetBuilder setPointOfCompass(String pointOfCompass) {
        this.pointOfCompass = pointOfCompass;
        return this;
    }

    public CabinetBuilder setIsSoundProof(boolean isSoundProof) {
        this.isSoundProof = isSoundProof;
        return this;
    }

    public CabinetBuilder setHasLibraryFurniture(boolean hasLibraryFurniture) {
        this.hasLibraryFurniture = hasLibraryFurniture;
        return this;
    }

    public CabinetBuilder setNumberOfBooksPossibleToStore(int numberOfBooksPossibleToStore) {
        this.numberOfBooksPossibleToStore = numberOfBooksPossibleToStore;
        return this;
    }

    public Cabinet createCabinet() {
        return new Cabinet(ceilingHeight, floorNumber, numberOfWindows, squareMeters,
                pointOfCompass, isSoundProof, hasLibraryFurniture, numberOfBooksPossibleToStore);
    }

    public RoomListBuilder addRoomToList() {
        Cabinet cabinet = createCabinet();
        this.roomListBuilder.addRoom(cabinet);
        return this.roomListBuilder;
    }
}
