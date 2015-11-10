package Repeat;

/**
 *
 * @author Mustafa Aslanov <facebook.com/mustafa260794>
 */
public class SubClass extends SuperClass{
    public int b = 100;
//    int b =10;
    
    @Override
    public void yaz(){
        System.out.println("Subb Classin yaz metodu ve b="+b);
        a=200;
    }
    
}
