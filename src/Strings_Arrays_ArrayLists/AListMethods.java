package Strings_Arrays_ArrayLists;

import java.util.*;
import static java.lang.System.out;

/**
 *
 * @author Mustafa <mustafa260794@gmail.com>
 */
public class AListMethods {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("x");
        l.add("y");
        l.add("z");
        out.println(l);
        l.add(1, "h");
        l.add(0, "m");
        out.println(l);

        l.clear();
        out.println(l);
        l.add("a");
        l.add("b");
        l.add("c");

        out.println("Contains a?: " + l.contains("a") + "   x?: " + l.contains("x"));
        l.remove(1);
        out.println(l);

        l.remove("a");
        out.println(l);

        l.add("qambay");
        l.add(0, "bcv");
        l.add(0, "sdad");
        l.add(3, "dsda");
        out.println("List: " + l + "    Index of c is: " + l.indexOf("c") );
        
        StringBuilder sb = new StringBuilder("Hesen kiwi");
        
    }
}
