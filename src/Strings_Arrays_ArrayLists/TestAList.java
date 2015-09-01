package Strings_Arrays_ArrayLists;

import java.util.*;

/**
 *
 * @author Mustafa <mustafa260794@gmail.com>
 */
public class TestAList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        
        list.add("Gedebey");
        list.add("Kurdemir");
        list.add("Posanni");
        
        int index = list.indexOf("Kurdemir");
        System.out.println(list+"  " + index);
        
        list.add(index, "Yevlax");
        System.out.println(list);
        
        
    }
}
