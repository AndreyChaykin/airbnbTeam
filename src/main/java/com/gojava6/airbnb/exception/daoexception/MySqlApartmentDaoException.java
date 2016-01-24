package com.gojava6.airbnb.exception.daoexception;

/**
 * @Autor Andrey Chaykin
 * @Since 16.11.2015
 */
public class MySqlApartmentDaoException extends RuntimeException {

    public MySqlApartmentDaoException(String message) {
        super(message);
    }

    public MySqlApartmentDaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
