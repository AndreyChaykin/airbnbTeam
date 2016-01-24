package com.gojava6.airbnb.model.apartment;

import java.io.Serializable;
import java.util.*;

public class Apartment implements Serializable {

    private int apartmentID;
    private int hostID;
    private ApartmentType apartmentType;
    private CityType city;
    private List<ReserveApartment> reserveBook; //todo add in db

    public Apartment() {
    }

    public Apartment(int apartmentID, int userID, int hostID, CityType city, String address, int rooms, int price) {
        this.apartmentID = apartmentID;
        this.hostID = hostID;
        this.city = city;
    }

    public Apartment(int apartmentID, int userID, int hostID, CityType city, String address, int rooms, int price, List<ReserveApartment> reserveBook) {
        this.apartmentID = apartmentID;
        this.hostID = hostID;
        this.city = city;
        this.reserveBook = reserveBook;
    }

    public int getApartmentID() {
        return apartmentID;
    }

    public void setApartmentID(int apartmentID) {
        this.apartmentID = apartmentID;
    }

    public int getHostID() {
        return hostID;
    }

    public void setHostID(int hostID) {
        this.hostID = hostID;
    }

    public CityType getCity() {
        return city;
    }

    public void setCity(CityType city) {
        this.city = city;
    }

    public List<ReserveApartment> getReserveBook() {
        return reserveBook;
    }

    public void setApartments(List<ReserveApartment> reserveBook) {
        this.reserveBook = reserveBook;
    }

    public ApartmentType getApartmentType() {
        return apartmentType;
    }

    public void setApartmentType(ApartmentType apartmentType) {
        this.apartmentType = apartmentType;
    }

    public void setReserveBook(List<ReserveApartment> reserveBook) {
        this.reserveBook = reserveBook;
    }

    public void addReserve(ReserveApartment reserve) {
        if(reserveBook == null) {
            reserveBook = new ArrayList<>();
        }
        reserveBook.add(reserve);
    }

    public void deleteReserve(ReserveApartment reserve) {
        if (reserveBook == null) return;
        for (ReserveApartment reserveApartment : reserveBook) {
            if(reserveApartment.getReserveID() == reserve.getReserveID()) {
                reserveBook.remove(reserve);
            }
        }
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "apartmentID=" + apartmentID +
                ", hostID=" + hostID +
                ", city=" + city +
                '}';
    }
}
