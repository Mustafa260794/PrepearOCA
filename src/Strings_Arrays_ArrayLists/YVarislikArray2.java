package Strings_Arrays_ArrayLists;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mustafa <mustafa260794@gmail.com>
 */
public class YVarislikArray2 extends YVarislikArray1 {
    public String yoxlama = "Sub class";
    
    public String yoxlamaMetod(){
    return "Sub classin metodu";}
    
    public static void main(String[] Qulam) {
        YVarislikArray1[] sup = new YVarislikArray1[5];
        YVarislikArray2[] sub = new YVarislikArray2[10];
        sup[0] = new YVarislikArray1();
        sub[0] = new YVarislikArray2();
        sub[9] = new YVarislikArray2();
    System.out.println(sub[0].yoxlama);
        sup = sub;
    System.out.println(sup[0].yoxlama+"   "+ sup[9].yoxlama);
    System.out.println(sup[0].yoxlamaMetod()+ "   "+ sup[9].yoxlamaMetod());
        
//        sup[6] = new YVarislikArray1(); <-- bunu verdikdede sehv verir cunki artiq sub classin obyektlerini goturur
        
        sub[0].yoxlama="Qulem";
    System.out.println(sup[0].yoxlama);
        
        //obyektlerde kecerli her wey burdada olur
        int[] a;
        int[] b = {3,4,5};
        a=b;
        System.out.println(a[0]);
        b[0] = 100;
        System.out.println(a[0]);
        
        List[] l = new ArrayList[100]; // :D
    }
}
