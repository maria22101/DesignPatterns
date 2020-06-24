package creational.builder.house_builder_complex;

import java.util.ArrayList;

public class Architect {

    public static void main(String[] args) {

        // 1st non-optimized option of creating a House:
        Room kitchen1 = new KitchenBuilder().setCeilingHeight(3).setFloorNumber(4).setSquareMeters(11)
                .createKitchen();
        Room cabinet1 = new CabinetBuilder().setCeilingHeight(2).setFloorNumber(1).setSquareMeters(9)
                .createCabinet();
        ArrayList<Room> rooms1 = new ArrayList<>();
        rooms1.add(kitchen1);
        rooms1.add(cabinet1);
        House house1 = new House(rooms1);

        // 2nd non-optimized option of creating a House:
        Room kitchen2 = new KitchenBuilder().setFloorNumber(2).setSquareMeters(5).setIsStudio(true)
                .createKitchen();
        Room cabinet2 = new CabinetBuilder().setFloorNumber(3).setSquareMeters(8).setHasLibraryFurniture(true)
                .createCabinet();
        ArrayList<Room> rooms2 = new RoomListBuilder().addList()
                .addRoom(kitchen2)
                .addRoom(cabinet2)
                .buildList();
        House house2 = new House(rooms2);

        // optimized option of creating a House
        ArrayList<Room> rooms3 = new RoomListBuilder().addList()
                .addKitchen().setFloorNumber(1).setSquareMeters(10).addRoomToList()
                .addCabinet().setFloorNumber(1).setPointOfCompass("East").addRoomToList()
                .buildList();
        House house3 = new House(rooms3);
    }
}
