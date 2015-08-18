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
public class TestClass extends abstractClassTest {
    int cd = 5;
    
    public static void main(String[] args) {
        AdiClass adi = new AdiClass();
        
        adi.adiMetod();
        
        haa h = new haa() {
            @Override
            public void menim() {
                System.out.println("Has");
            }

            @Override
            public void herMethod() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }

    @Override
    public void qoz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void herMethod() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
