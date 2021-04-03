package com.geektech;

public class Main {

    public static void main(String[] args) {
        createObject("Car");
        System.out.println("_________________________");
        createObject("Plane");
        System.out.println("_________________________");
        createObject("Vessel");

    }

    public static Transport createObject(String className) {
        switch (className) {
            case "Car":
                Car car = new Car("Внедорожник", "Lexus", 2017, 5.7, 45000);
                car.print();
                return car;
            case "Plane":
                Plane plane = new Plane("Пассажирский", "Ту-134", 1984, 27, 85);
                plane.print();
                return plane;
            case "Vessel":
                Vessel vessel = new Vessel("Грузовое", "Ever Given", 2015, "Нидерланды", "Китай");
                vessel.print();
                return vessel;
            default:
                return null;

        }
    }
}
