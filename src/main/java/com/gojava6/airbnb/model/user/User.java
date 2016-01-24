package com.gojava6.airbnb.model.user;


import com.gojava6.airbnb.exception.UserValidationException;
import com.gojava6.airbnb.exception.typeException.ApartmentTypeException;
import com.gojava6.airbnb.model.apartment.Apartment;
import java.io.Serializable;
import java.util.*;
import static com.gojava6.airbnb.validation.UserValidation.validationRenter;

public class User implements Observer, Serializable {

    private int userId;
    private UserType userType;
    private String firstName;
    private String lastName;
    private String eMail;
    private String password;
    private List<Apartment> apartments; //todo add in db

    public User() {
    }

    public User(String firstName, String surname, String eMail) {
        try {
            if (validationRenter(firstName, surname, eMail)) {
                this.firstName = firstName;
                this.lastName = surname;
                this.eMail = eMail;
                userType = UserType.RENTER;
            }
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }

    public User(int userId, UserType userType, String firstName, String lastName, String eMail, List<Apartment> apartments) {
        this.userId = userId;
        this.userType = userType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.apartments = apartments;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(List<Apartment> apartments) {
        this.apartments = apartments;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addApartment(Apartment apartment) throws ApartmentTypeException {
        if(apartment == null) {
            throw new ApartmentTypeException("Cannot add apartment in collection, Apartment is null.");
        }
        if (apartments == null) {
            apartments = new ArrayList<>();
        }
        apartments.add(apartment);
    }

    public Apartment getApartment(int apartmentID) {
        for (Apartment apartment : apartments) {
            if (apartment.getApartmentID() == apartmentID) {
                return apartment;
            }
        }
        return null;
    }

    public void update() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, firstName, lastName);
    }


}
