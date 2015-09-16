package Flow_Control_and_Exceptions;

import java.io.IOException;

/**
 *
 * @author Mustafa Aslanov <facebook.com/mustafa260794>
 */
public class TestThrown {
    static public void main(String... Qulam) throws IOException {
        metod1("salam");
        System.out.println(metod2());
//        try {
//        } catch (Throwable e) {   } //<-- etmek mumkundu. Exception bundan extends edib cunki...

    }
    
    static void metod1(String s) throws NullPointerException, StringIndexOutOfBoundsException{
    String reverse ="";
        for (int i = s.length()-1; i >=0; i--) {
            reverse += s.charAt(i);
        }
        System.out.println(reverse);
    }
    
    static int metod2() throws NullPointerException, IOException/* NOTE:! <-- IOExcp. Checked exceptiondu
    ona gore checked exceptionlari throws etdikde mainde onu cagirdiqda mutleqdiki ta try catch-a alaq
    yada maindede onu throws edek... yoxsa COMPILE error verir.!*/{
    return metod3();
    }
    
    static int metod3() throws NullPointerException{
        return 1;
    }
    
    static void metod4(){
    throw new NullPointerException();
    }
}
