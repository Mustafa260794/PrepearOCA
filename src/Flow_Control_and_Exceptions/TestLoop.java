package Flow_Control_and_Exceptions;

/**
 *
 * @author Mustafa <mustafa260794@gmail.com>
 */
public class TestLoop {

    public static void main(String[] args) {
        int a = 2;
        while (a == 2) {
            System.out.println(++a + "\n");
        }
        
//------------------------------------------------------------------------------
        do {
            System.out.println("Do loop\n");
        } while (false);

//------------------------------------------------------------------------------
        for (int i = 0, g=4, c = 100; i < 10; i++) {
            System.out.println("for loop");
            i=10;//i-ni daxilde deyiwdikde for ozu dayanir
        }
        
        System.out.println(doStuff()); //keep in mind! Forun icindeki return qayidir :)
        
//        for( ; ; ){ } //-->Sonsuz dovur!
//------------------------------------------------------------------------------
        for(int i=0 , j=0 ; i<5 && j<10 ; i++, j++){
            System.out.println(i+"    "+j);
    }
//------------------------------------------------------------------------------
        int x = 5;
        for(x=0; x<20 ; ++x){ //burda sonda x++ ve ya ++x hec bir ferq elemir.
            System.out.print(x+", ");}
        System.out.println(" son fordan colde qiymet :D -->"+x);
//------------------------------------------------------------------------------
        int af = 3;
        for(System.out.println("ciz"); af<5; System.out.print("qidi-")){
        af++;}
        System.out.println("\b\n");
        for(int bf=1 ; af<7; System.out.println("pifpaf")){
        af+=bf;
        }
        
    }
//------------------------------------------------------------------------------
    static boolean doStuff(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Forun ici doStuff() metodu i--> 1-10");
            return true;
        }
        return false;
    }
}
