package Flow_Control_and_Exceptions;

/**
 *
 * @author Mustafa Aslanov <facebook.com/mustafa260794>
 */
public class TestExceptionPropagate {
    public static void main(String[] Qulam) {
        try{
        System.out.println(reverse(null));
        }
        finally{
            System.out.println("ERROR Finally");}
        
    }
    
    static String reverse (String s) {
        String reverseStr ="";
    for(int i=s.length()-1; i>=0; i--){
    reverseStr+= s.charAt(i);
    }
    return reverseStr;
    }
    
}
