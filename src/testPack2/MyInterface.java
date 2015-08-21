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
public interface MyInterface extends MyInterface2, MyInterface3{
    
//burda extend edilen interface-lerde iki eyni adli metod olsa eyni parametrlerde ancaq ferqli returnlerle. ERROR!
    
    /*public abstract*/ void myInterfaceMethod() throws Exception;
}
