package edu.wctc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class RoomReader implements Serializable {
    private ArrayList<Room> roomList = new ArrayList<Room>();
    public ArrayList<Room> readRoomFile(String fileName ) {

        try
        {

            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(file);


            roomList = (ArrayList) ois.readObject();




            ois.close();
            file.close();
            System.out.println("The file was read successfully! Choose view rooms to view the rooms.");
        }

        catch(IOException | ClassNotFoundException e)
        {
            System.out.println("Something went wrong while reading the file: " + e);
        }
        return roomList;
    }
}
