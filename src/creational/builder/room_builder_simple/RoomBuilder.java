package creational.builder.room_builder_simple;

public interface RoomBuilder {

    RoomBuilder setCeilingHeight (int ceilingHeight);

    RoomBuilder setFloorNumber (int floorNumber);

    RoomBuilder setNumberOfWindows (int numberOfWindows);

    RoomBuilder setSquareMeters (int squareMeters);

    RoomBuilder setPointOfCompass (String pointOfCompass);
}
