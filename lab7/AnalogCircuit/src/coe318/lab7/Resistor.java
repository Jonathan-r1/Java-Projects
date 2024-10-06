/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author SJona
 */
public class Resistor {
    private double resistance;
    private int node1, node2;
    private int res_id;
    private static int counter = 1;
   // Constructor
    public Resistor(int node1, int node2, double resistance){
      
        this.resistance = resistance;
        this.res_id = counter; // Assign unique ID
        counter ++; //increment
        this.node1 = node1;
        this.node2 = node2;

    }
    public int [] getNodes(){
        int nodes[] = new int[2];
        nodes[0] = this.node1;
        nodes[1] = this.node2;
        return nodes;
    }
    @Override
    public String toString(){
        return("R" + this.res_id + " " + this.node1 + " " + this.node2 + " " + this.resistance+" ohm.");
        
}
}

