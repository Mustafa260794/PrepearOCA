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
public class ConstruktorTest extends ConstruktorSub{
    
    static{System.out.println("Test clasin static kodu");}
    static{System.out.println("Test classin 2-ci statici");}
    
    
    public static void main(String[] args) {
        ConstruktorSub c = new ConstruktorSub();
        ConstruktorSuper cc = new ConstruktorSub();
        
//        ConstruktorSub ccc =(ConstruktorSub) new ConstruktorSuper();
        
        cc.metodStatic();
        
        new ConstruktorSub().metodStatic();
        
    }
}
