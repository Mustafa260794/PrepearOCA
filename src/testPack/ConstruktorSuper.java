/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPack;

/**
 *
 * @author user
 */
public class ConstruktorSuper {
    
    static{System.out.println("Super classin statici");}
    
    {System.out.println("super classin obyekt kodu");}
    
    
    public ConstruktorSuper(){
        System.out.println("Super Classin Konstruktoru");
    }
    
    public ConstruktorSuper(String s){
        System.out.println("Parametr konstruktorlu super class");
    }
    
    protected static void metodStatic(){
    String s="Static metod super";
        System.out.println(s);
    }
}
