/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assingnments;

import java.awt.Dimension;

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
        
        Dimension c = new Dimension(10, 5);
        
        System.out.println(c.height + " Heigh");
        
        Dimension s = c;
        
        s.height=100;
        
        System.out.println(c.height+"<-- c.heigh    s.heigh= "+s.height);
    }
}
