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
public class MySubClass extends MySuper{
    
    
    @Override
    public void myMethod() {
        super.myMethod();
        System.out.println("SubClass");
    }
    
    
    //subtype return qebul olunandi
    @Override
    public MySubClass myReturnMethod(){
    
    return new MySubClass();
    }
    
    
    
    //overload. parametr yazmasaydim ve return qoysaydim overload sayilmaz ve sehv vererdi.
    public int myMethod(int a){
    return 0;
    }
    
    public void myMethod(String a, int b, double c){
        System.out.println(a+b+c);
    }
    public void myMethod(int b, String a, double c){
        System.out.println(b+a+c);
        return;//bunu ede bilerem :) amma menasizdi hecne qayitmayacaqsa,
    }
    
    
    //meyhod adlari boyuk kicik adlara hessasdir. Class adlari yox amma.
    private void MyMethod(){
        System.out.println("bu basqa methoddu MyMethod");
        
        super.myMethod();
    }
    
    public static void main(String[] args) {
        MySuper my = new MySubClass();
        MySubClass my2 = new MySubClass();
        
        my2.myReturnMethod();
        my.myMethod();
        my2.myMethod();
        my2.MyMethod();
        my2.myMethod(3, "hass",4.0);
        my2.myMethod("hass", 3, 4.0);
        
    }
    
}
