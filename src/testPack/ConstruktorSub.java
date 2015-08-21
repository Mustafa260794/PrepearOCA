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
public class ConstruktorSub extends ConstruktorSuper {
    
    
    static {
        System.out.println("sub classin statici");}
    
    {System.out.println("Obyekt baslangici kod");}
    
    
    private final String gedebey="Kartof";
    
    public ConstruktorSub(){
//    this("parametrli konstruktor subclass");// burda this(gedebey); deye bilmerem cunki olmazda ala :D
        System.out.println("adi konstruktor subclass");
    }
    
    public ConstruktorSub(String s){
        super(s); // burdada super(gedebey) deye bilmerem cunki ilk olaraq super constora cirt birt olmalidi :)
        //gedebey static olsaydi onda s evezine vermek olardi. cunki instancedi amma static...
        System.out.println(gedebey);
    }
    
    
    public static void main(String[] args) {
        ConstruktorSub c = new ConstruktorSub();
        
        
        String name = new String[]{"Mustafa","Aslan","Arif"}[1];
        System.out.println("\n"+name);
        
        
        
    }
    
    
    
    public static void metodStatic(){
        System.out.println("Static method sub class");
    }
    
    
    
//    public void doIt(){
//    doNow();
//    }
//    public void doNow(){
//    doIt();
//    }
    
}