/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista1.exe2;

/**
 *
 * @author 1090482113038
 */
public class Testa {
        public static void main(String[] args) {
            Cliente obj1 = new Cliente(1234, 123456, "Fulano", 500.50);
            obj1.deposito(100);
            obj1.saque(200);
            
            System.out.println(obj1.testeCliente());
            
            Cliente obj2 = new Cliente(5678, 789102, "Ciclano", 1500.20);
            obj2.saque(500);
            obj2.deposito(1000);
            
            System.out.println(obj2.testeCliente());
    }
    
}
