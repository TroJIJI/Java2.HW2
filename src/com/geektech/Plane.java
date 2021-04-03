package com.geektech;

public class Plane extends Transport implements  Printable{
    private int weight;
    private int capacity;

    public Plane(String appointment, String name, int year,int weight,int capacity) {
        super(appointment, name, year);
        this.weight=weight;
        this.capacity=capacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void print() {
        System.out.println(getAppointment()+" "+getName()+"✈️ "+" \nгод: "+getYear()+"\nмасса: "+getWeight()+"т"+"\nвместимость: "+getCapacity());

    }
}
