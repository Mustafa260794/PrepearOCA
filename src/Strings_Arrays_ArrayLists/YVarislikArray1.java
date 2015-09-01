package Strings_Arrays_ArrayLists;

import java.util.Random;

/**
 *
 * @author Mustafa <mustafa260794@gmail.com>
 */
public class YVarislikArray1 {
    public String yoxlama="Super Class";
    public String yoxlamaMetod(){
    return "Super classin metodu";}
    
    public static void main(String[] Qulam) {
        Random r = new Random();
        int[][] a = new int [4][5];
        int [] b = new int [6];
        for (int i = 0; i < 6; i++) {
            b[i] = r.nextInt();
        }
        a[3] = b;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(a[i][j]);
            }
            System.out.println("");
        }
       
        System.out.println(a[3][5]);
        b[5]=3;
        System.out.println(a[3][5   ]);
        
    }
    
    
}
