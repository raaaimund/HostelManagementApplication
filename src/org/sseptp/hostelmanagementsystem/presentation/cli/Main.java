package org.sseptp.hostelmanagementsystem.presentation.cli;

import org.sseptp.hostelmanagementsystem.data.arraylist.ArrayListRoomDao;
import org.sseptp.hostelmanagementsystem.logic.Room;
import org.sseptp.hostelmanagementsystem.logic.RoomDao;

public class Main {
    public static final int ADD_ROOM_MENU_ITEM = 1;
    public static final int SHOW_ROOMS_MENU_ITEMS = 2;
    public static final int EXIT_MENU_ITEM = 3;

    public static void main(String[] args) {
        Menu menuItems = new Menu();
        RoomDao roomDao = new ArrayListRoomDao();
        UserInputReader inputReader = new UserInputReader();
        menuItems.show();
        int chosenMenuItem = inputReader.chooseMenuItem();

        while (chosenMenuItem != EXIT_MENU_ITEM) {
            menuItems.show();
            chosenMenuItem = inputReader.chooseMenuItem();

            switch (chosenMenuItem) {
                case ADD_ROOM_MENU_ITEM:
                    String roomName = inputReader.readRoomName();
                    Room newRoom = new Room();
                    newRoom.setRoomName(roomName);
                    roomDao.add(newRoom);
                    break;
                case SHOW_ROOMS_MENU_ITEMS:
                    for (Room currentRoom : roomDao.getAll()) {
                        System.out.println(currentRoom);
                    }
                    break;
            }
        }

    }
}
