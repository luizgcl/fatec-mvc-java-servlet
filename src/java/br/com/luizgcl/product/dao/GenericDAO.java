/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.luizgcl.product.dao;

import java.util.List;

/**
 *
 * @author luizleme
 */
public interface GenericDAO {
    
    public Boolean save(Object object);
    
    public List<Object> get();
    
    public void delete(int idObject);
    
    public Object find(int idObject);
    
    public Boolean update(Object object);
}
