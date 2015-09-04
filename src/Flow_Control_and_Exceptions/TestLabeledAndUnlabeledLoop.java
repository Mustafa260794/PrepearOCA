package Flow_Control_and_Exceptions;

/**
 *
 * @author Mustafa <mustafa260794@gmail.com>
 */
public class TestLabeledAndUnlabeledLoop {
    public static void main(String[] args) {
        birinci: //<-- labeled loop ucun label
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i+1+" break");
                break birinci;
            }
        }
        System.out.println("end");
        
        ikinci:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < 100; k++) {
                    for (int l = 0; l < 100; l++) {
                        System.out.println(i+1+" continue");
                        continue ikinci;
                    }
                }
            }
        }
        
        
    }
    
}
