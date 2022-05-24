package org.sseptp.hostelmanagementsystem.logic;

import org.sseptp.hostelmanagementsystem.data.arraylist.ArrayListRoomDao;
import org.sseptp.hostelmanagementsystem.logic.infrastructure.RoomDao;
import org.sseptp.hostelmanagementsystem.logic.infrastructure.RoomService;
import org.sseptp.hostelmanagementsystem.logic.models.Room;

import java.util.List;

public class RoomServiceImpl implements RoomService {
    private final RoomDao roomDao;

    public RoomServiceImpl() {
        roomDao = new ArrayListRoomDao();
    }

    @Override
    public void add(Room room) {
        roomDao.add(room);
        // add logic here
    }

    @Override
    public List<Room> getAll() {
        return roomDao.getAll();
    }
}
