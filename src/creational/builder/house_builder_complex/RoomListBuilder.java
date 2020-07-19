package creational.builder.house_builder_complex;

import java.util.ArrayList;

public class RoomListBuilder {
    private ArrayList<Room> listOfRooms;

    public RoomListBuilder addList() {
        listOfRooms = new ArrayList<>();
        return this;
    }

    public RoomListBuilder addRoom(Room room) {
        listOfRooms.add(room);
        return this;
    }

    public KitchenBuilder addKitchen() {
        return new KitchenBuilder(this);
    }

    public CabinetBuilder addCabinet() {
        return new CabinetBuilder(this);
    }

    public ArrayList<Room> buildList() {
        return listOfRooms;
    }
}
