package com.gojava6.airbnb.dao;

import com.gojava6.airbnb.exception.daoexception.MySqlUserDaoException;
import com.gojava6.airbnb.model.apartment.CityType;
import com.gojava6.airbnb.model.user.User;

import java.util.List;

/**
 * @Autor Andrey Chaykin
 * @Since 28.10.2015
 */
public interface IUserDAO {

    void create(User user) throws MySqlUserDaoException;
    User retrieveById(int userID) throws MySqlUserDaoException;
    User retrieveByEMail(String eMail) throws MySqlUserDaoException;
    List<User> retrieveAllHostsByCity(CityType city) throws MySqlUserDaoException;
    List<User> retrieveAllRentersByCity(CityType city) throws MySqlUserDaoException;
    List<User> retrieveAllUsersByCity(CityType city) throws MySqlUserDaoException;
    String retrieveNameByEMail(String email);
    void update(User user) throws MySqlUserDaoException;
    void delete(User user) throws MySqlUserDaoException;
    void becomeHost(User renter) throws MySqlUserDaoException;

}
