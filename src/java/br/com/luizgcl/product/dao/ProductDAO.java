/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.luizgcl.product.dao;

import br.com.luizgcl.product.model.Product;
import br.com.luizgcl.product.util.ConnectionFactory;
import java.util.List;
import java.util.Arrays;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author luizleme
 */
public class ProductDAO implements GenericDAO {
    
    private Connection conn;
    
    public ProductDAO() throws Exception {
        try{
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com Sucesso!");
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean save(Object object)  {
        Product product = (Product) object;
       
        PreparedStatement stmt = null;
       
        String sql = "insert into products(name, description) values(?,?);";
       
        try{
           stmt = conn.prepareStatement(sql);
           stmt.setString(1, product.getProductName());
           stmt.setString(2, product.getProductDescription());
           stmt.execute();
           return true;
        }catch(Exception ex) {
           System.out.println("Problema ao cadastrar produto! \n" + "Erro: "+ex.getMessage());
           ex.printStackTrace();
           
        }finally{
           try{
               ConnectionFactory.closeConnection(conn, stmt);
           }catch(Exception ex){
               System.out.println("Problema ao fechar conexão \n"+ "Erro: "+ex.getMessage());
           }
        }
       return false;
    }

    @Override
    public List<Object> get() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object find(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean update(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
