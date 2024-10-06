/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author SJona
 */
public class Voltage {
    private double voltage;
    private int node1, node2;
    private int volt_id;
    private static int counter = 1;
    
    public Voltage(int node1, int node2, double voltage){
        this.voltage = voltage;
        volt_id = counter;
        counter++;
        this.node1 = node1;
        this.node2 = node2;
    }
    public int[] getNodes(){
        int nodes[] = new int[2];
        nodes[0] = this.node1;
        nodes[1] = this.node2;
        return nodes;
    }
    @Override
    public String toString(){
        return("V" + this.volt_id + " " + this.node1 + " " + this.node2 + " DC " + this.voltage+" V.");
        
}
}
