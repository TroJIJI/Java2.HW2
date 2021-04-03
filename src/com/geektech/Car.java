package com.geektech;

public class Car extends Transport implements Printable{
    private double volume;
    private int cost;

    public Car(String appointment, String name, int year,double volume,int cost) {
        super(appointment, name, year);
        this.cost=cost;
        this.volume=volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public void print() {
        System.out.println(getAppointment()+" "+getName()+"\uD83D\uDE97 "+" \nгод: "+getYear()+"\nобъем: "+getVolume()+"\nстоимость: "+getCost()+"$");
    }
}
