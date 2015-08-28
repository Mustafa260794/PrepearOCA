package Strings_Arrays_ArrayLists;

/**
 *
 * @author Mustafa <mustafa260794@gmail.com>
 */
public class BaslangicTest {
    public static void main(String... qulam) {
        String s = "My name is ";
        s=s.concat("Mustafa");
        System.out.println(s);
        
        String[] ss = s.split("");
        for(String z : ss){
            System.out.println(z);}
        
        String h = s.replaceAll("Mustafa", "Qulam");
        System.out.println(h);
        
        h = h.replace('a', 'ə');
        System.out.println(h);
        
        h = "  "+h;
        System.out.println(h);
        h= h.trim();
        System.out.println(h);
        
        h = h.toUpperCase();
        System.out.println(h);
    }
}
