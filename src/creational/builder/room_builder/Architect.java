package creational.builder.room_builder;

public class Architect {
    public static void main(String[] args) {
        Bedroom bedroom = new BedroomBuilder()
                .setCeilingHeight(3)
                .setFloorNumber(2)
                .setNumberOfWindows(1)
                .setPointOfCompass("North")
                .setSquareMeters(18)
                .setIsDouble(true)
                .setHasBathroom(false)
                .createBedroom();

        ChildrenRoom childrenRoom = new ChildrenRoomBuilder()
                .setCeilingHeight(3)
                .setFloorNumber(3)
                .setNumberOfWindows(1)
                .setPointOfCompass("West")
                .setSquareMeters(17)
                .setNumberOfBeds(3)
                .setNumberOfDesks(2)
                .createChildrenRoom();

        System.out.println(bedroom);
        System.out.println(childrenRoom);
    }
}
