package testPack2;

import Repeat.SubClass;
import Repeat.SuperClass;

/**
 *
 * @author Mustafa Aslanov <facebook.com/mustafa260794>
 */
public class TesterClass extends SubClass{
    public int b =50;
    public static void main(String[] args) {
        TesterClass t = new TesterClass();
        SuperClass sp = new SuperClass();
        SubClass sb = new SubClass();
        
        SuperClass ss = new TesterClass();
        
        ss.yaz();
        System.out.println("b="+ss.b);
    }
}
