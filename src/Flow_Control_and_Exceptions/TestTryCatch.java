package Flow_Control_and_Exceptions;
/**
 *
 * @author Mustafa
 */
public class TestTryCatch {
    public static void main(String[] args) {
        System.out.println(getString());
        try{
        sehv();
            System.out.println("Iwledi");
        }catch(Exception e){
            System.out.println("Iwlemedi SEHV!"+e);
        }
    }
    
    static public String getString(){
    try{
        int a=3/0;
        return "Kod Iwledi TRY block";
    }catch (IllegalArgumentException ex){
        return "Sehv Illegal exception";
    
    }catch(ArithmeticException e){
        System.err.println("0-a bolme!");
        return "Sehv arichmetic exception";
     
    }catch(NullPointerException e){
        return "Sehv Exception Nullpoint ";
        
    }catch(Exception e){
        return "Yoxlanan sehvler bitti umumi sehv!";
    }finally{
        System.out.println("Finallyde sout :D ");
//    return "Finally block";// <--  NOTE: Bunu vermesem trydaki return iwleyecek versem finallyde...
    }
//        System.out.println("nese"); <-- olmaz!
    }
    
    static void sehv(){
    int a = 4/0;}
}
