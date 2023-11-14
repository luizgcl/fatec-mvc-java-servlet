/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.luizgcl.product.model;

/**
 *
 * @author luizleme
 */
public class Aluno 
{
    
    int idAluno;
    String nomeAluno;
    int idadeAluno;
    
    public Aluno() { }
    
    public Aluno(int idAluno, String nomeAluno, int idadeAluno) 
    {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
    }
    
    public int getIdAluno()
    {
        return this.idAluno;
    }
    
    public void setIdAluno(int idAluno)
    {
        this.idAluno = idAluno;
    }
    
    public String getNomeAluno()
    {
        return this.nomeAluno;
    }
    
    public void setNomeAluno(String nomeAluno)
    {
        this.nomeAluno = nomeAluno;
    }
    
    public int getIdadeAluno()
    {
        return this.idadeAluno;
    }
    
    public void setIdadeAluno(int idadeAluno) 
    {
        this.idadeAluno = idadeAluno;
    }
}
