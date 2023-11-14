/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.luizgcl.product.dao;

import br.com.luizgcl.product.model.Aluno;
import br.com.luizgcl.product.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luizleme
 */
public class AlunoDAO implements GenericDAO<Aluno> {
    
    private Connection conn;
    
    public AlunoDAO() throws Exception {
        try{
            this.conn = ConnectionFactory.getConnection();
            System.out.println("PostgreSQL: Conectado com Sucesso!");
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Boolean save(Aluno aluno) 
    {
        PreparedStatement stmt = null;
       
        String sql = "insert into alunos(nomealuno, idadealuno) values(?,?);";
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, aluno.getNomeAluno());
            stmt.setInt(2, aluno.getIdadeAluno());
            stmt.execute();
            return true;
        } catch (SQLException e) {
             System.err.println("Problema ao cadastrar Aluno! \n" + "Erro: "+ e.getMessage());
        } finally {
             try{
               ConnectionFactory.closeConnection(conn, stmt);
           } catch(Exception e){
               System.out.println("Problema ao encerrar conexão \n"+ "Erro: "+ e.getMessage());
           }
        }
        
        return false;
    }

    @Override
    public List<Aluno> get() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from alunos;";
        List<Aluno> alunos = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Aluno aluno = new Aluno();
                
                aluno.setIdAluno(rs.getInt("idaluno"));
                aluno.setNomeAluno(rs.getString("nomealuno"));
                aluno.setIdadeAluno(rs.getInt("idadealuno"));
                
                alunos.add(aluno);
            }
        } catch (SQLException e) {
             System.err.println("Problema ao listar Alunos! \n" + "Erro: "+ e.getMessage());
        } finally {
             try{
               ConnectionFactory.closeConnection(conn, stmt);
           } catch(Exception e){
               System.out.println("Problema ao encerrar conexão \n"+ "Erro: "+ e.getMessage());
           }
        }
        
        return alunos;
    }

    @Override
    public void delete(int idAluno) {
        PreparedStatement stmt = null;
       
        String sql = "delete from alunos where idaluno = ?;";
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idAluno);
            stmt.execute();
        } catch (SQLException e) {
             System.err.println("Problema ao deletar Aluno! \n" + "Erro: "+ e.getMessage());
        } finally {
             try{
               ConnectionFactory.closeConnection(conn, stmt);
           } catch(Exception e){
               System.out.println("Problema ao encerrar conexão \n"+ "Erro: "+ e.getMessage());
           }
        }
    }

    @Override
    public Aluno find(int idAluno) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from alunos where idaluno = ?;";
        Aluno aluno = null;
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idAluno);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                aluno = new Aluno();
                
                aluno.setIdAluno(rs.getInt("idaluno"));
                aluno.setNomeAluno(rs.getString("nomealuno"));
                aluno.setIdadeAluno(rs.getInt("idadealuno"));
            }
        } catch (SQLException e) {
             System.err.println("Problema ao procurar Alunos! \n" + "Erro: "+ e.getMessage());
        } finally {
             try{
               ConnectionFactory.closeConnection(conn, stmt);
           } catch(Exception e){
               System.out.println("Problema ao encerrar conexão \n"+ "Erro: "+ e.getMessage());
           }
        }
        
        return aluno;
    }

    @Override
    public Boolean update(Aluno aluno) {
        PreparedStatement stmt = null;
       
        String sql = "update alunos set nomealuno = ?, idadealuno = ? where idaluno = ?;";
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, aluno.getNomeAluno());
            stmt.setInt(2, aluno.getIdadeAluno());
            stmt.setInt(3, aluno.getIdAluno());
            stmt.execute();
            return true;
        } catch (SQLException e) {
             System.err.println("Problema ao atualizar Aluno! \n" + "Erro: "+ e.getMessage());
        } finally {
             try{
               ConnectionFactory.closeConnection(conn, stmt);
           } catch(Exception e){
               System.out.println("Problema ao encerrar conexão \n"+ "Erro: "+ e.getMessage());
           }
        }
        
        return false;
    }
    
}
