/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assingnments;

import java.awt.Dimension;

/**
 *
 * @author user
 */
public class TestPassingVariables {
    
    public void deyisme(Dimension d){
    d.height+=1;
        System.out.println("metod daxilinde uzunluq: "+d.height);
    }
    
    
    public void deyisme(int a){
    a++;
        System.out.println("Metod daxilinde primitivin qiymeti: "+a);
    }
    
    
    static public void main(String... meherrem){
        Dimension dm = new Dimension(10,20);
        System.out.println("Obyekt tanimlanan anda uzunluq: "+dm.height);
        
        TestPassingVariables t = new TestPassingVariables();
        t.deyisme(dm);
        System.out.println("Metoddan cixdiqdab sonra uzunluq: " +dm.height);
        
        
        int a = 4;
        System.out.println("\n\ntanimlanma adininda primitivin qiymeti: "+a);
        
        t.deyisme(a);
        System.out.println("Metoddan cixdiqdan sonra primitivin qiymeti: "+a);
        
    }
   
    
}
