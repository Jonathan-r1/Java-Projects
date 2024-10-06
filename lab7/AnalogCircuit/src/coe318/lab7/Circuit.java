/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;
import java.util.ArrayList;
/**
 *
 * @author SJona
 */
public class Circuit {
    private ArrayList<Object> circuit = new ArrayList();
    private static Circuit instance = null;
    
    // Method to return an instance of Circuit class  
    public static Circuit getInstance(){
        if(instance == null){
            instance = new Circuit();
        // Returns the instance
        }
        return instance;
    }
    
    // Default constructor
    private Circuit() {}
    
    // Method to add resistors to array list
    void add(Resistor r){
        circuit.add(r);
    }
    void addVoltage(Voltage v){
        circuit.add(v);
    }
    @Override
    public String toString()
    {
        String result = "";
        for(int i = 0; i < circuit.size(); i++)
            result += circuit.get(i) + "\n";
        return result;
    }
}

