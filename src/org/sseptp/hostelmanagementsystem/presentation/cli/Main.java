package org.sseptp.hostelmanagementsystem.presentation.cli;

import org.sseptp.hostelmanagementsystem.data.arraylist.ArrayListRoomDao;
import org.sseptp.hostelmanagementsystem.logic.RoomServiceImpl;
import org.sseptp.hostelmanagementsystem.logic.infrastructure.RoomService;
import org.sseptp.hostelmanagementsystem.logic.models.Room;
import org.sseptp.hostelmanagementsystem.logic.infrastructure.RoomDao;

public class Main {
    public static final int ADD_ROOM_MENU_ITEM = 1;
    public static final int SHOW_ROOMS_MENU_ITEM = 2;
    public static final int EXIT_MENU_ITEM = 3;
    private static final int NO_MENU_ITEM_SELECTED = 0;

    public static void main(String[] args) {
        int chosenMenuItem = NO_MENU_ITEM_SELECTED;
        Menu menuItems = new Menu();
        RoomService roomService = new RoomServiceImpl();
        UserInputReader inputReader = new UserInputReader();

        while (chosenMenuItem != EXIT_MENU_ITEM) {
            menuItems.show();
            chosenMenuItem = inputReader.chooseMenuItem();

            switch (chosenMenuItem) {
                case ADD_ROOM_MENU_ITEM:
                    String roomName = inputReader.readRoomName();
                    Room newRoom = new Room();
                    newRoom.setRoomName(roomName);
                    roomService.add(newRoom);
                    break;
                case SHOW_ROOMS_MENU_ITEM:
                    for (Room currentRoom : roomService.getAll()) {
                        System.out.println(currentRoom);
                    }
                    break;
            }
        }

    }
}
