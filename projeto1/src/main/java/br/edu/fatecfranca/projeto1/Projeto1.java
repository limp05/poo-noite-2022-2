/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.projeto1;

/**
 *
 * @author 1090482113038
 */
public class Projeto1 {

    public static void main(String[] args) {
        Produto obj1 = new Produto();
        obj1.nome = "Bola de basquete";
        obj1.qtde = 3;
        obj1.preco = 120;
        
        System.out.println("Nome " + obj1.nome + " Qtde: " + obj1.qtde + " Preço " + obj1.preco);
                
    }
}

