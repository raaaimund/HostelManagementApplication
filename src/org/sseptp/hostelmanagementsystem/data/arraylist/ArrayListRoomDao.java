package org.sseptp.hostelmanagementsystem.data.arraylist;

import org.sseptp.hostelmanagementsystem.logic.Room;
import org.sseptp.hostelmanagementsystem.logic.RoomDao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListRoomDao implements RoomDao {
    private final List<Room> rooms;

    public ArrayListRoomDao() {
        rooms = new ArrayList<>();
    }

    @Override
    public void add(Room room) {
        rooms.add(room);
    }

    @Override
    public List<Room> getAll() {
        return rooms.stream().toList();
    }
}
