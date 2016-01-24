package com.gojava6.airbnb.model.apartment;

import java.io.Serializable;
import java.util.*;

public class Apartment implements Serializable {

    private int apartmentID;
    private int userID;
    private int hostID;
    private CityType city;
    private String address;
    private int rooms;
    private int price;
    private List<ReserveApartment> reserveBook;

    public Apartment() {
    }

    public Apartment(int apartmentID, int userID, int hostID, CityType city, String address, int rooms, int price) {
        this.apartmentID = apartmentID;
        this.userID = userID;
        this.hostID = hostID;
        this.city = city;
        this.address = address;
        this.rooms = rooms;
        this.price = price;
    }

    public Apartment(int apartmentID, int userID, int hostID, CityType city, String address, int rooms, int price, List<ReserveApartment> reserveBook) {
        this.apartmentID = apartmentID;
        this.userID = userID;
        this.hostID = hostID;
        this.city = city;
        this.address = address;
        this.rooms = rooms;
        this.price = price;
        this.reserveBook = reserveBook;
    }

    public int getApartmentID() {
        return apartmentID;
    }

    public void setApartmentID(int apartmentID) {
        this.apartmentID = apartmentID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<ReserveApartment> getReserveBook() {
        return reserveBook;
    }

    public void setApartments(List<ReserveApartment> reserveBook) {
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
                ", address='" + address + '\'' +
                ", rooms=" + rooms +
                '}';
    }
}
