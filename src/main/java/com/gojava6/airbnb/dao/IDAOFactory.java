package com.gojava6.airbnb.dao;



import com.gojava6.airbnb.dao.jdbc.apartmentdao.MySqlApartmentDao;
import com.gojava6.airbnb.dao.jdbc.userdao.MySqlUserDao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Autor Andrey Chaykin
 * @Since 28.10.2015
 */
public interface IDAOFactory {

    Connection getConnection() throws SQLException;
    MySqlUserDao getUserDAO();
    MySqlApartmentDao getApartmentDAO ();

}
