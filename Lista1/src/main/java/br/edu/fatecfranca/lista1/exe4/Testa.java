/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista1.exe4;

/**
 *
 * @author 1090482113038
 */
public class Testa {
        public static void main(String[] args) {
        Rio obj1 = new Rio("Rio 1", 10, false);
        obj1.sujar();
        obj1.chover(10);
        obj1.ensolarar(15);
            System.out.println(obj1.mostrar());
            
        Rio obj2 = new Rio("Rio 2", 20, true);
        obj2.limpar();
        obj2.chover(50);
        obj2.ensolarar(60);
            System.out.println(obj2.mostrar());
    }
    
}
