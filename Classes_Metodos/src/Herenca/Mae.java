/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herenca;

/**
 *
 * @author MP
 */
public class Mae {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void andar() {
        System.out.println("A "+ this.nome +" Está andando...");
    }
    public void correr(){
        System.out.println("A "+ this.nome +" Está correndo...");
    }
}
