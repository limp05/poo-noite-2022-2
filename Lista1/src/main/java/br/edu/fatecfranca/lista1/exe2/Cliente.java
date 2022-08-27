/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista1.exe2;

/**
 *
 * @author 1090482113038
 */
public class Cliente {
    public int nroConta, nroAgencia;
    public String nome;
    public double saldo;
    
    
    public Cliente(){
        
    }
    
    public Cliente(int nroConta, int nroAgencia, String nome, double saldo){
        this.nroConta = nroConta;
        this.nroAgencia = nroAgencia;
        this.nome = nome;
        this.saldo = saldo;
          
    }
    
    public void deposito(double x){
        this.saldo = this.saldo + x;
    }

    public void saque(double x){
        if (this.saldo >= x){
            this.saldo = this.saldo - x;
        }
        else System.out.println("saque negado");    
    }
    
    public String testeCliente(){
        return "Numero conta: " + nroConta + " Nome: " + nome + " Saldo atual: " + saldo;
    }
}
