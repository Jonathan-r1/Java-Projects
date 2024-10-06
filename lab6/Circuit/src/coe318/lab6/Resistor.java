/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author SJona
 */
public class Resistor {
    public double resistance;
    public Node node1, node2;
    public int res_id;
    public static int counter = 1;
   // Constructor
    public Resistor(double resistance, Node node1, Node node2){
        if(resistance<0){
            throw new IllegalArgumentException();
        }
        if(node1 == null || node2 == null){
            throw new IllegalArgumentException();
        }
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.res_id = counter; // Assign unique ID
        counter ++; //increment
    }
    public Node [] getNodes(){
        Node[] nodes = new Node[2];
        nodes[0] = this.node1;
        nodes[1] = this.node2;
        return nodes;
    }
    @Override
    public String toString(){
        return("R" + this.res_id + " " + this.node1 + " " + this.node2 + " " + this.resistance+" ohm.");
        
}
}