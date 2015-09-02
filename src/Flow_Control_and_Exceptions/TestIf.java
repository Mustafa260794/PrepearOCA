package Flow_Control_and_Exceptions;

/**
 *
 * @author Mustafa <mustafa260794@gmail.com>
 */
public class TestIf {
    public static void main(String[] args) {
        if(true)
        if(false)
                System.out.println("ifin ici");
        else 
            System.out.println("Elsin ici");
        
        if(true && true && false || true && false || true){
            System.out.println("true");
        }
        
        if(false && false | true) // --> (false && (false | true))
            System.out.println("true ikinci");
        
        if(false || true && false) //--> (false || (true && false))
            System.out.println("true ucuncu");
        
        if(true && false ||false) // --> ((true && false) || false)
            System.out.println("true dorduncu");
        
        //oncelik sirasi coxdan aza dogru --> $  ^  |  $$  ||
        
    }
}
