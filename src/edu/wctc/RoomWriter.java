package edu.wctc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class RoomWriter implements Serializable {

    public void writeRoomFile(String fileName, ArrayList<Room> roomList) {
        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(roomList);

            out.close();
            file.close();
            System.out.println("Rooms were written!");

        } catch (IOException e) {
            System.out.println("Something went wrong: " + e);
        }

    }
}
