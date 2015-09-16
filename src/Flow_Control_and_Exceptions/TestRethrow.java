package Flow_Control_and_Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Mustafa Aslanov <facebook.com/mustafa260794>
 */
public class TestRethrow {
    public static void main(String[] args) {
                sehvMethod();
        try {
            adiMethodSehvQaytaran();
        } catch (IOException ex) {
        }
    }
    
    static void sehvMethod() throws ArrayIndexOutOfBoundsException{
    try{
    int [] a = new int [3];
    int b = a[34];
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("ala out of bount\n");
        throw new IllegalArgumentException(); //eslinde bu exception yoxdu sadece ozun bunu geri gondere bilersen
    }
    }
    
    static void sehvCheckedException() throws FileNotFoundException{
    try{
        RandomAccessFile r = new RandomAccessFile("MYfile.txt", "r");
        byte[] b = new byte[100];
        r.readFully(b, 0, 1000);
    }catch (FileNotFoundException ex) {
            throw ex;
    }catch(IOException e){
    }
    }
    
    static void adiMethodSehvQaytaran() throws IOException{
    throw new IOException(); //eger geriye checked exception qaytarilirsa onda throwsa mutleq elave etmek lazimdi!
    }
}
