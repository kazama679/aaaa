package com.data.ss8.ra.repository;

import com.data.ss8.ra.connection.ConnectionDB;
import com.data.ss8.ra.model.Employee;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryImp implements EmployeeRepository {
    @Override
    public List<Employee> findAll() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Employee> employees = new ArrayList<Employee>();
        try{
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call find_all_employee()}");
            ResultSet rs = callSt.executeQuery();
            while(rs.next()){
                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setName(rs.getString("name"));
                employee.setEmail(rs.getString("email"));
                employee.setPosition(rs.getString("position"));
                employees.add(employee);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return employees;
    }

    @Override
    public boolean save(Employee employee) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean result = false;
        try{
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call add_employee(?,?,?)}");
            callSt.setString(1, employee.getName());
            callSt.setString(2, employee.getEmail());
            callSt.setString(3, employee.getPosition());
            callSt.executeUpdate();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;
    }
}
