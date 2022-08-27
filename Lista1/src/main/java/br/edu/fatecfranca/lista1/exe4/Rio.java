/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista1.exe4;

/**
 *
 * @author 1090482113038
 */
public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;
    
    
    public Rio(){
        
    }
    
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
        
    }
    
    public void chover(float x){
        this.nivel += x;
    }
    
    public void ensolarar(float x){
        if (this.nivel >= x) {
            this.nivel -= x;
        }
    }
    
    public void limpar(){
        if (this.poluido){
            this.poluido = false;
    }
    }
    
    public void sujar(){
        if (!this.poluido){
            this.poluido = true;
        }
    }
    
    public String mostrar(){
        return "Nome: " + nome + " Nivel: " + nivel + " Poluido: " + poluido;
    }
}
