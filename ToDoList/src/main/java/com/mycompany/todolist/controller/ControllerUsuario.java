/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist.controller;

import com.mycompany.todolist.model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class ControllerUsuario {
    
    private ArrayList<Usuario> listaDeUsuarios = new ArrayList<>();
    
    
    public void addUsuario(Usuario usuario){
        this.listaDeUsuarios.add(usuario);
    }
    
    public ArrayList<Usuario> getListaDeUsuarios(){
       return this.listaDeUsuarios;
    }    
    
       
}
