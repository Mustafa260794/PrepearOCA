/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPack2;

/**
 *
 * @author user
 */
public class ConsSub extends ConsSuper {
    
    public ConsSub(){
        super("Vasif");// burda bu olmasa ve kosntruktor umumiyyetle olmasa extends etmek olmaz hec.
//        this("Gedebey"); vermek olmaz, cunki bunlardan birini tanimlamaq olar yalnizca
        //bunlar her ikiside super(),this() must be first statement
        System.out.println("Konstruktor SubClass");
    }
    
    public ConsSub(String s){
//burda her birinde super verme sebebi bow konstruktorun private olmasidi super classda.        
    super("Hesen");
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        ConsSub c = new ConsSub();
        
    }
    
}
