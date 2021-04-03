package com.geektech;

public class Transport {
    private String appointment;
    private int year;
    private String name;

    public Transport (String appointment,String name, int year) {
        this.appointment = appointment;
        this.year = year;
        this.name=name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
