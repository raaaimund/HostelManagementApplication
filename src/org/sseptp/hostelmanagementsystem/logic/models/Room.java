package org.sseptp.hostelmanagementsystem.logic.models;

public class Room {
    private String roomName;
    private int roomNumber;

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomName='" + roomName + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
