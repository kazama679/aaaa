package com.data.ss8.ra.repository;

import com.data.ss8.ra.connection.ConnectionDB;
import org.springframework.stereotype.Repository;
import com.data.ss8.ra.model.Customer;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepositoryImp implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Customer> customers = new ArrayList<Customer>();
        try{
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call find_all()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setFullName(rs.getString("full_name"));
                customer.setEmail(rs.getString("email"));
                customer.setGender(rs.getString("gender"));
                customer.setCustomerType(rs.getString("customer_type"));
                customers.add(customer);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return customers;
    }
}