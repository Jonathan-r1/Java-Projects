/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;
import java.util.ArrayList;

public class Circuit{

    ArrayList<Resistor> resistors = new ArrayList<Resistor>();
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
    void add(Resistor r)
    {
        resistors.add(r);
    }
    
    // Overloads toString() method to return circuit information
    public String toString()
    {
        String result = "";
        for(int i = 0; i < resistors.size(); i++)
            result += resistors.get(i) + "\n";
        return result;
    }
}
