package Flow_Control_and_Exceptions;

/**
 *
 * @author Mustafa <mustafa260794@gmail.com>
 */
public class TestEnhancedLoop {
    public static void main(String[] args) {
        int a=5;
        int[] l = {1,2,3,4,5,6,7,8,9};
        for(int b:l){
            System.out.println(b);
            return; //--> attention! burdan sonrasi iwlemir. MAIN bitir!
        }
        
        System.out.println(a);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside loop");
            continue;
//            System.out.println("gogogo"); //ATTENTION! Bunu versen error everecek! compile error!
        }
        
    }
    
}
