/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assingnments;

/**
 *
 * @author Mustafa
 */
public class VariableInitialization {
    String s;
    int a;
    
    public void showVariables(){
        System.out.println("Deaful object: "+s+" |Default primitives: "+a);
    }
    
    public static void main(String[] args) {
        VariableInitialization v = new VariableInitialization();
        v.showVariables();
        System.out.println("\n");
        
        String c = "Salam";
        String s = c;
        
        c="Hahaha";
        System.out.println(c+"   "+s);
    }
}
