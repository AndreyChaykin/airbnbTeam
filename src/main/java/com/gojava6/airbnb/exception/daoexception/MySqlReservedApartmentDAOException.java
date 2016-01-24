package com.gojava6.airbnb.exception.daoexception;

/**
 * @Autor Andrey Chaykin
 * @Since 19.11.2015
 */
public class MySqlReservedApartmentDAOException extends RuntimeException {

    public MySqlReservedApartmentDAOException(String message) {
        super(message);
    }

    public MySqlReservedApartmentDAOException(String message, Throwable cause) {
        super(message, cause);
    }
}
