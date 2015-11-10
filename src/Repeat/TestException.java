package Repeat;

/**
 *
 * @author Mustafa Aslanov <facebook.com/mustafa260794>
 */
public class TestException {
    public static void main(String[] args) {
        try{
            int a = 5/0;
            System.out.println("Inside Try!");
        }catch(ArithmeticException e ){
//            int a = 5/0;
            System.out.println("Inside catch!");
        }finally{
        int a = 5/0;
            System.out.println("inside finally!");
        }
    }
}
