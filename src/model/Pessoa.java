/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 200901268
 */
public class Pessoa {
    
    private String nome;
    private int palpite;
    
    public Pessoa() {
    }
    
    public Pessoa(String nome, int palpite) {
        this.nome = nome;
        this.palpite = palpite;
        
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPalpite() {
        return palpite;
    }

    public void setPalpite(int palpite) {
        this.palpite = palpite;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", palpite=" + palpite + '}';
    }
    
    
    
}
