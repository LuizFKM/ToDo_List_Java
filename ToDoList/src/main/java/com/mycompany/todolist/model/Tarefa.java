/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist.model;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Tarefa {
    private String titulo;
    private String descricao;
    private boolean isConcluida;
    private Date data;

    public Tarefa(String titulo, String descricao, boolean isConcluida, Date data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.isConcluida = isConcluida;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isIsConcluida() {
        return isConcluida;
    }

    public void setIsConcluida(boolean isConcluida) {
        this.isConcluida = isConcluida;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "titulo=" + titulo + ", descricao=" + descricao + ", isConcluida=" + isConcluida + ", data=" + data + '}';
    }
    
    
    
    
}







//A classe tarefa deve possuir os seguintes atributos privados:  título, descrição, concluída, data.