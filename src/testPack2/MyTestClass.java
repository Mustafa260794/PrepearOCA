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
public class MyTestClass extends MySubClass{
    public static void main(String[] args) {
        MySuper my =(MySuper)/*<--burda cast olmasada olar*/ new MySubClass();
        System.out.println((new MyTestClass() instanceof MyInterface));
        my.myMethod();
        ((MySubClass)my).myMethod(3);
        my.myInterfaceMethod();
        
//        MySubClass mmm =(MySubClass) new MySuper();
    }
}
