package com.gojava6.airbnb.dao;

import com.gojava6.airbnb.exception.daoexception.MySqlApartmentDaoException;
import com.gojava6.airbnb.model.apartment.Apartment;
import com.gojava6.airbnb.model.apartment.CityType;


import java.util.List;

/**
 * @Autor Andrey Chaykin
 * @Since 13.11.2015
 */
public interface IApartmentDAO {

    void create(Apartment apartment) throws MySqlApartmentDaoException;
    Apartment retrieveByID(int id) throws MySqlApartmentDaoException;
    List<Apartment> retrieveAllByCity(CityType city) throws MySqlApartmentDaoException;
    List<Apartment> retrieveAllByHost(int hostID) throws MySqlApartmentDaoException;
    void update(Apartment apartment) throws MySqlApartmentDaoException;
    void delete(int apartmentID) throws MySqlApartmentDaoException;
}
