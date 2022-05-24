package org.sseptp.hostelmanagementsystem.logic.infrastructure;

import org.sseptp.hostelmanagementsystem.logic.models.Room;

import java.util.List;

public interface RoomDao {
    void add(Room room);
    List<Room> getAll();
}
