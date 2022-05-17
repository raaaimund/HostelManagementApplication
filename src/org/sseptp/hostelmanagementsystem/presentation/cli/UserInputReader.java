package org.sseptp.hostelmanagementsystem.presentation.cli;

import java.util.Scanner;

public class UserInputReader {
    public int chooseMenuItem(){
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter your choice ");
        int choice =inputReader.nextInt();
       return choice;
    }

    public String readRoomName(){
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter your RoomName ");
        String  roomName =inputReader.nextLine();
        return roomName;

    }
}
