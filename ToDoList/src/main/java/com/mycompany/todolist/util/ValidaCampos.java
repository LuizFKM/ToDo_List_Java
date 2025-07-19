/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist.util;

import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author User
 */
public class ValidaCampos {
     public boolean validaTextField(JTextField campo, 
            String texto){
        if(campo.getText().equals(texto)){   
            campo.setBorder(new LineBorder(Color.RED,2));
            return true;
        }else{
            campo.setBorder(new LineBorder(Color.GRAY,1));
            return false;
        }
    }
     
     public boolean validaTextArea(JTextArea campo, String texto){
         if(campo.getText().equals(texto)){   
            campo.setBorder(new LineBorder(Color.RED,2));
            return true;
        }else{
            campo.setBorder(new LineBorder(Color.GRAY,1));
            return false;
        }
     }
     
     public boolean validaFormattedField(JFormattedTextField campo, String texto){
        if(campo.getText().equals(texto)){   
            campo.setBorder(new LineBorder(Color.RED,2));
            return true;
        }else{
            campo.setBorder(new LineBorder(Color.GRAY,1));
            return false;
        }
     }
     
     
     
     public boolean validarDataDaTarefa(JFormattedTextField campo){
        if(campo.getText().contains(" ")){   
            campo.setBorder(new LineBorder(Color.RED,2));
            return true;
        }else{
            campo.setBorder(new LineBorder(Color.GRAY,1));
            return false;
        }
    }
     
     public boolean validarRadioButton(JRadioButton concluida, 
            JRadioButton pendente){
        if(!concluida.isSelected() && !pendente.isSelected()){
            concluida.setBorder(new LineBorder(Color.RED, 2));
            pendente.setBorder(new LineBorder(Color.RED, 2));
            
            concluida.setBorderPainted(true);
            pendente.setBorderPainted(true);
            return true;
        }else{
            concluida.setBorder(new LineBorder(Color.GRAY, 1));
            pendente.setBorder(new LineBorder(Color.GRAY, 1));
            
            concluida.setBorderPainted(false);
            pendente.setBorderPainted(false);
            return false;
        }
    }
     
    public boolean validaPasswordField(JPasswordField campo, 
            String texto){
        
        String valorCampo = String.valueOf(campo.getPassword());
        
        if(valorCampo.equals(texto)){   
            campo.setBorder(new LineBorder(Color.RED,2));
            return true;
        }else{
            campo.setBorder(new LineBorder(Color.GRAY,1));
            return false;
        }
    }
}
