package com.geektech;

public class Vessel extends Transport implements  Printable{
    private String placeArrive;
    private String country;

    public Vessel(String appointment, String name, int year,String placeArrive,String country) {
        super(appointment, name, year);
        this.country=country;
        this.placeArrive=placeArrive;
    }

    public String getPlaceArrive() {
        return placeArrive;
    }

    public void setPlaceArrive(String placeArrive) {
        this.placeArrive = placeArrive;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void print() {
        System.out.println(getAppointment()+" "+getName()+"\uD83D\uDEA2"+" \nгод: "+getYear()+"\nместо прибытия: "+getPlaceArrive()+"\nMade in "+getCountry());

    }
}
