package Flow_Control_and_Exceptions;

/**
 *
 * @author Mustafa <mustafa260794@gmail.com>
 */
public class TestSwitchCase {

    public static void main(String[] args) {
        switch (5) {
            case 4:
                System.out.println("fizillig");
                System.out.println("qambay kiwi");
                break;
            case 5:
                System.out.println("5 ");
            case 6: {
                System.out.println("6 oldi");
                System.out.println("case 6");
                break;
            }
            case 7: {
                System.out.println("ala 7 oldi");
            }
            default: {
                System.out.println("Hewbirinden");
            }
        }

        
        switch (3) {
            case 3:
                System.out.println("Nem a nedise)");
                break;
            default:
                System.out.println("a deyil");
            case 'a':
                System.out.println("a-di");
            case 45:
                System.out.println("45-di");
        }

        
        switch (Days.MONDAY) {
            case THURSDAY:
                System.out.println("2-ci gundu hele var");
                break;
            case MONDAY:
                System.out.println("1-ci gundu hefte sonuna ohoooo ne qeder var");
                break;
            default:
                System.out.println("cz");
        }

    }

    enum Days {

        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

}
