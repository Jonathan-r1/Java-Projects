/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author SJona
 */
public class test {
        
    public static void main(String[] args){
        Circuit cir = Circuit.getInstance();
        Node node0 = new Node();
        Node node1 = new Node();
        Node node2 = new Node();
        Resistor res = new Resistor (30, node1, node2);
        Resistor res1 = new Resistor(20, node2,node0);
        Resistor res2 = new Resistor(100, node2, node0);
        cir.add(res);
        cir.add(res1);
        cir.add(res2);
        System.out.println(node1);
        System.out.println(node2);
        System.out.println(node0);
        System.out.println(cir);
    }
    
}
    

