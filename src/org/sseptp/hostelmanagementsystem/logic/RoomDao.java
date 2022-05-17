package org.sseptp.hostelmanagementsystem.logic;

import java.util.List;

public interface RoomDao {
    void add(Room room);
    List<Room> getAll();

}
