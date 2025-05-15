package com.data.ss8.ra.repository;

import com.data.ss8.ra.connection.ConnectionDB;
import com.data.ss8.ra.model.Product;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImp implements ProductRepository {
    @Override
    public List<Product> findAll() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Product> products = new ArrayList<Product>();
        try{
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call find_all_product()}");
            ResultSet rs = callSt.executeQuery();
            while(rs.next()){
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                product.setDescription(rs.getString("description"));
                products.add(product);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return products;
    }

    @Override
    public Product findById(int id) {
        Connection conn = null;
        CallableStatement callSt = null;
        Product product = null;
        try{
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call find_by_id_product(?)}");
            callSt.setInt(1, id);
            ResultSet rs = callSt.executeQuery();
            while(rs.next()){
                product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                product.setDescription(rs.getString("description"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return product;
    }

    @Override
    public boolean add(Product product) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean result = false;
        try{
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call add_product(?,?,?)}");
            callSt.setString(1, product.getName());
            callSt.setDouble(2, product.getPrice());
            callSt.setString(3, product.getDescription());
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