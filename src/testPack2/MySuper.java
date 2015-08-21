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
public class MySuper implements MyInterface {
    
    
    protected void myMethod() {
        System.out.println("Super class My Method");   
    }
    
    public MySuper myReturnMethod(){
    
        return new MySuper();
    }

    @Override
    public void myInterfaceMethod() {
        System.out.println("Interface Method");
    }

    @Override
    public void Metodum() {
        
    }

   

    
    
}
