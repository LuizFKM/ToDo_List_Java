/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist.model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Tarefa {
    private String titulo;
    private String descricao;
    private String isConcluida;
    private LocalDate data;

    public Tarefa() {
    }
    
    

    public Tarefa(String titulo, String descricao, String isConcluida, LocalDate data) {
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

    public String getIsConcluida() {
        return isConcluida;
    }

    public void setIsConcluida(String isConcluida) {
        this.isConcluida = isConcluida;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "titulo=" + titulo + ", descricao=" + descricao + ", isConcluida=" + isConcluida + ", data=" + data + '}';
    }
    
    
    
    
}







//A classe tarefa deve possuir os seguintes atributos privados:  título, descrição, concluída, data.