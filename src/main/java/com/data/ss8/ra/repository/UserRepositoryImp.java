package com.data.ss8.ra.repository;

import com.data.ss8.ra.connection.ConnectionDB;
import com.data.ss8.ra.model.User;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

@Repository
public class UserRepositoryImp implements UserRepository {
    @Override
    public User findById(int id) {
        Connection conn = null;
        CallableStatement callSt = null;
        User user = null;
        try{
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call find_by_id_user(?)}");
            callSt.setInt(1, id);
            ResultSet rs = callSt.executeQuery();
            while(rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPhone(rs.getString("phone"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return user;
    }

    @Override
    public boolean add(User user) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean result = false;
        try{
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call add_user(?,?,?)}");
            callSt.setString(1, user.getName());
            callSt.setString(2, user.getEmail());
            callSt.setString(3, user.getPhone());
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
