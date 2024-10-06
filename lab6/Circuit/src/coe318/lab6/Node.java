/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author SJona
 */
public class Node {
    public int id;
    public static int id_num = 0;
        // Contructor
    public Node(){
        this.id = id_num;
        id_num ++;
    }
    @Override
    public String toString(){
        // return node id in string format
        return("" + this.id);
    }
}
