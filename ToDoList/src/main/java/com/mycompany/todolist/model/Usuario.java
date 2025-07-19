/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist.model;

/**
 *
 * @author Aluno
 */
public class Usuario {
    private String nomeCompleto;
    private String email;
    private String senha;

    public Usuario() {
    }

    
    
    public Usuario(String nome, String email, String senha){
        this.nomeCompleto = nome;
        this.email = email;
        this.senha = senha;
    }
    
    public void setNomeCompleto(String nome){
        this.nomeCompleto = nome;
    }  
    
    public String getNomeCompleto(){
        return this.nomeCompleto;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getSenha(){
        return this.senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nomeCompleto=" + nomeCompleto + ", email=" + email + ", senha=" + senha + '}';
    }
        
        
    
    
}
