package com.gojava6.airbnb.dao;

import com.gojava6.airbnb.exception.daoexception.MySqlReservedApartmentDAOException;
import com.gojava6.airbnb.model.apartment.ReserveApartment;

import java.util.Date;
import java.util.List;

public interface IReservedApartmentDAO {

    void create(int apartmentID, int hostID,int renterID, Date dateIN, Date dateOUT);

    List<ReserveApartment> retrieveApartmentByID(int apartmentID);

    List<ReserveApartment> retrieveAoartmentsByHostID(int hostID);

    void update(int apartmentID, int hostID, int renterID,
                Date oldCheckIN, Date oldCheckOUT, Date newCheckIn, Date newCheckOut);

    void delete(int apartmentID, int hostID, int renterID, Date dateIN, Date dateOUT);

    boolean isReserved(int apartmentID, Date checkIN, Date checkOUT) throws MySqlReservedApartmentDAOException;
}
