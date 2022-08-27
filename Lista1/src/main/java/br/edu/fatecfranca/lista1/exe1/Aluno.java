/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista1.exe1;

/**
 *
 * @author 1090482113038
 */
public class Aluno {
    public int nroAluno; // tipo primitivo 
    public String nome; // tipo de Classe
    public double p1, p2; // tipo premitivo
    
    // comstrutor sem parâmetro
    public Aluno(){
        
    } 
    public Aluno(int nroAluno, String nome, double p1, double p2){
        this.nroAluno = nroAluno;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    //calcular e retorna média final
    public double notaFinal(){
        
        return (this.p1 + this.p2) / 2;
    }
    public String dadosAluno(){
        return "Nome: " + this.nome + " Numero aluno: " + this.nroAluno + " Média: " + this.notaFinal();
    }
    
    // verifica se o aluno passou
    public void passou(){
        if (this.notaFinal() >= 6){
            System.out.println("Aluno aprovado");
        }
        else {
            System.out.println("Aluno Reprovado");
        }
    }
        
}
