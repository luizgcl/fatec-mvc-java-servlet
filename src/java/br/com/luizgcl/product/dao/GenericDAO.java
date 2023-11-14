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
public interface GenericDAO<T> {
    
    public Boolean save(T object);
    
    public List<T> get();
    
    public void delete(int idObject);
    
    public T find(int idObject);
    
    public Boolean update(T object);
    
}
