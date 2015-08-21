/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object_Orientation;

/**
 *
 * @author user
 */
public class TestClass2 extends TestClass1{
    
    public TestClass2(){
        super("Vasif");
        System.out.println("Parametrsiz sub");
    }
    
    public TestClass2(String s){
    this();
        System.out.println("Parametli sub");
    }
    
    String name = "Qasim";
    String cagir(){return "Come here Qasim";}
    
    
    public static void main(String[] args) {
        TestClass2 t = new TestClass2("Qasimovic");
        System.out.println("\n\n");
        
        TestClass1 tt = new TestClass2();
        System.out.println(t.name+"   "+t.cagir());
        
    }
    
}
