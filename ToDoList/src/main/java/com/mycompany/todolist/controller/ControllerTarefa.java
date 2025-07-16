/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist.controller;

import com.mycompany.todolist.model.Tarefa;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class ControllerTarefa {
    private ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
    
    public void addTarefa(Tarefa tarefa){
        listaDeTarefas.add(tarefa);
    }
    
    public void atualizaTabela(JTable tabela){
    DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
    modelo.setRowCount(0);
    
    for (Tarefa t: listaDeTarefas){
        Object [] linha = {
            t.getTitulo(),
            t.getDescricao(),
            t.getData(),
            t.isIsConcluida()
        };
        modelo.addRow(linha);
    }
    
    }
    
    public void editarTarefa(int index, Tarefa tarefa){
        if(index >= 0 && index < listaDeTarefas.size()){
            listaDeTarefas.set(index, tarefa);
        }
    }    
    
    public void excluirTarefa(int index){
        if(index >= 0 && index < listaDeTarefas.size()){
            listaDeTarefas.remove(index);
        }
    }
    
    public ArrayList<Tarefa> getTarefa(){
        return listaDeTarefas;
    }    
    
    public Tarefa getTarefa(int index){
        if(index >= 0 && index < listaDeTarefas.size()){
            return listaDeTarefas.get(index);
        }
        return null;
    }
    
   
}
