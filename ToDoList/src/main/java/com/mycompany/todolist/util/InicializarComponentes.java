/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist.util;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class InicializarComponentes {
    public void configuraTextField(JTextField campo, String texto){
        campo.setText(texto);
        campo.setForeground(Color.GRAY);
        
        campo.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if(campo.getText().equals(texto)){
                    campo.setText("");
                    campo.setForeground(Color.black);
                }   
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(campo.getText().equals("")){
                    campo.setText(texto);
                    campo.setForeground(Color.gray);
                }
            }
        });
    }
    
    public void configuraTextArea(JTextArea campo, String texto){
        campo.setText(texto);
        campo.setForeground(Color.GRAY);
        
        campo.addFocusListener(new FocusAdapter(){
            @Override
            public void focusGained(FocusEvent e){
                if(campo.getText().equals(texto)){
                    campo.setText("");
                    campo.setForeground(Color.black);
                }
            }
            
            @Override
            public void focusLost(FocusEvent e) {
                if(campo.getText().equals("")){
                    campo.setText(texto);
                    campo.setForeground(Color.gray);
                }
            }
   
        });
        
    }
    
    public void configCampoSenha(JPasswordField componente, 
            String texto){
        componente.setText(texto);
        componente.setForeground(Color.GRAY);
        componente.setEchoChar((char) 0);
        
        componente.addFocusListener(new FocusAdapter(){
            
            @Override
            public void focusGained(FocusEvent e){
                componente.setText("");
                componente.setForeground(Color.BLACK);
                componente.setEchoChar('*');
            }
            
            @Override
            public void focusLost(FocusEvent e){
                if(String.valueOf(componente.getPassword()).equals("")){
                    componente.setText(texto);
                    componente.setForeground(Color.GRAY);
                    componente.setEchoChar((char) 0);
                }
            }
        });
    }
    
    
    public void configCheckBox(JCheckBox componente, JPasswordField campoSenha, String texto, String senha){
        if(componente.isSelected() || senha.equals(texto)){
            campoSenha.setEchoChar((char) 0); 
        }else{
            campoSenha.setEchoChar('*');
        }
     }
}
