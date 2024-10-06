/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author SJona
 */
public class UserMain{
    private static int first, second;
    private static double value;
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Circuit cir = Circuit.getInstance();
        String new_input = "";
        
        while(input != null){
            new_input = input.nextLine();
            String arr[] = new_input.split(" ");
            if (arr.length > 4){
                new_input = "";
                throw new IllegalArgumentException("Invalid entry: Enter type 'v' or 'r' followed by nodes and value, each separated by a space.\"");
            }
            if(new_input.equals("spice"))
                System.out.println(cir.toString());
            if (new_input.startsWith("v")){
                first = Integer.parseInt(arr[1]);
                second = Integer.parseInt(arr[2]);
                value = Double.parseDouble(arr[3]);
                Voltage volt = new Voltage(first, second, value);
                cir.addVoltage(volt);
            }
            if (new_input.startsWith("r")){
                first = Integer.parseInt(arr[1]);
                second = Integer.parseInt(arr[2]);
                value = Double.parseDouble(arr[3]);
                Resistor res = new Resistor(first, second, value);
                cir.add(res);
            }
        
        if (new_input.equals("end"))
            break;
    }
        System.out.println("All Done!");
    }
    
}
