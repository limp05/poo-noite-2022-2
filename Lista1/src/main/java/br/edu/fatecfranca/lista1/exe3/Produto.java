/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista1.exe3;

/**
 *
 * @author 1090482113038
 */
 // abstrato e serve de modelo para seus objetos
public class Produto {
    public String nome; // tipode de dados é string (uma classe)
    public int qtde; // tipo de dado é int (tipo primitivo)
    public double preco; //tipo de dado é double (tipo premitivo)
    
    //cria um método construtor
    public Produto(){
    
    }
    
    //criar um método construtor
    public Produto(String nome, int qtde, double preco){
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    //um método que compra um produto aumentando sua quantidade
    //método não retorna nada
    public void comprar(int x){
        this.qtde = this.qtde + x;
    }
    //um método que vende um produto diminuindo sua quantidade
    //método não retorna nada
    public void vender(int x){
        if (qtde >= x){
            this.qtde = this.qtde - x;
        }
        else System.out.println("não tem estoque");    
    }
    
    public void mostrar(){
        System.out.println("Nome: " + this.nome + " Qtde: " + this.qtde + " Preço" + this.preco);
    }
    
    public void subir(double x){
        this.preco += x;
    }
    
    public void descer(double x){
        if (x <= this.preco){
            this.preco -= x;
        }
        else System.out.println("Esse valor vai ficar negativo");
    }
}
    
