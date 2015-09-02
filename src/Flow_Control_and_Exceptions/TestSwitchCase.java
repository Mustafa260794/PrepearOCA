package Flow_Control_and_Exceptions;

/**
 *
 * @author Mustafa <mustafa260794@gmail.com>
 */
public class TestSwitchCase {
    public static void main(String[] args) {
        switch(5){
            case 4 : System.out.println("fizillig");
                System.out.println("qambay kiwi");
                break;
            case 5 : System.out.println("5 ");
            case 6: { System.out.println("6 oldi");
                System.out.println("case 6");
                break;}
            case 7: {System.out.println("ala 7 oldi");}
            default : { System.out.println("Hewbirinden"); }
        
        }
    }
    
}
