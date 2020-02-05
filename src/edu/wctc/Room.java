package edu.wctc;

import java.io.Serializable;
import java.util.ArrayList;

public class Room implements Serializable, Paintable {

    private static int roomCount = 0;
    private int roomNum;
    private ArrayList<Paintable> wallList;
    double area;
    public Room(double length, double width, double height) throws BadWidthException, BadHeightException {
        roomNum = ++roomCount;

        wallList = new ArrayList<>();

        Wall wallA = new Wall(length, height);
        wallList.add(wallA);
        Wall wallB = new Wall(length, height);
        wallList.add(wallB);
        Wall wallC = new Wall(width, height);
        wallList.add(wallC);
        Wall wallD = new Wall(width, height);
        wallList.add(wallD);
        area = wallA.getArea() + wallB.getArea() + wallC.getArea() + wallD.getArea();
    }

    @Override
    public String toString() {
        return "Room{" +
                "Room Number :" + roomNum +
                "Total Area: " + area +
                '}';
    }

    public double getArea() {
        double area = 0;

        for (int i = 0; i < wallList.size(); i++) {
            Wall w = (Wall)wallList.get(i);
            area += w.getArea();
        }

        return area;
    }
}
