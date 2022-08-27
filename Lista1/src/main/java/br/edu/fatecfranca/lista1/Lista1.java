/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.lista1;

import br.edu.fatecfranca.lista1.exe3.Produto;
/**
 *
 * @author 1090482113038
 */
public class Lista1 {

    public static void main(String[] args) {
        //criar objetos da classe produto
        // criari instâncias da classe produto
        Produto obj1 = new Produto();
        obj1.nome = "Máscara";
        obj1.qtde = 100;
        obj1.preco = 5;
        
        obj1.comprar(10);
        System.out.println("Nome: " + obj1.nome + " Qtd: " + obj1.qtde + " Preco: " + obj1.preco);
        
        // bamos instanciar explorando o método construtor
        // método que tem o mesmo nome da classe
        //todo que inicializa as variáveis da classe
        //chama o método construtor
        Produto obj2 = new Produto("Bola de basquete", 10, 90);

        
        obj2.comprar(3);
            System.out.println("Nome: " + obj2.nome + " Qtd: " + obj2.qtde + " Preco: " + obj2.preco);
        
        Produto obj3 = new Produto("Fortine", 1, 39.90);
      
        obj3.comprar(2);
        obj3.vender(1);
        
        
        obj3.descer(20);
        
        System.out.println("Nome: " + obj3.nome + " Qtd: " + obj3.qtde + " Preco: " + obj3.preco);
    }
}
