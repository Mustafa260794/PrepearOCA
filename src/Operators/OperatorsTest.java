package Operators;

/**
 *
 * @author Mustafa
 */
public class OperatorsTest {
    public OperatorsTest(){}
    
    static public void main(String... gulbadam){
        int x=2, y=2;
         
        int v= y+++ ++x;
        System.out.println(v+"  "+x+"   "+y);
        
        OperatorsTest op = new OperatorsTest();
        System.out.println(op instanceof Object);
        
    }
    
    
}
