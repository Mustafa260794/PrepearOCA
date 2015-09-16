package Flow_Control_and_Exceptions;

/**
 *
 * @author Mustafa Aslanov <facebook.com/mustafa260794>
 */
public class MyException extends Exception{
    
    static void checkFood(Meyve m) throws MyException{
    if(m==Meyve.ALMA || m==Meyve.ARMUD)
        throw new MyException();
    }
    
    static public void main(String... Qulam){
        try {
//            go();
            checkFood(Meyve.ALMA);
        } catch (MyException | Error ex) {
            System.err.println(ex);
        }
        int a = 4;
        a*=23;
        System.out.println(a);
        
        
    }
    
    static void go(){
    go();}
    
}

enum Meyve{
ALMA, ARMUD, HEYVA, NAR;
}