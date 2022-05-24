package org.sseptp.hostelmanagementsystem.data.arraylist;

import org.sseptp.hostelmanagementsystem.logic.models.Room;
import org.sseptp.hostelmanagementsystem.logic.infrastructure.RoomDao;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRoomDao implements RoomDao {
    private final List<Room> rooms;

    public ArrayListRoomDao() {
        rooms = new ArrayList<>();
    }

    @Override
    public void add(Room room) {
        rooms.add(room);
        // do some database related stuff here
     }

    @Override
    public List<Room> getAll() {
        return new ArrayList<>(rooms);
    }
}
