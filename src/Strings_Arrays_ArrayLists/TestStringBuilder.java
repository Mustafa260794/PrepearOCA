package Strings_Arrays_ArrayLists;

/**
 *
 * @author Mustafa <mustafa260794@gmail.com>
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("\nHello World :D");
        
        sb.append("\nI'm joking\n");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        
        sb.insert(0,"0123456789");
        System.out.println(sb);
        
        sb.delete(2, 5); //birinci arqument saymani 0-dan goturur ikinci 1-den
        System.out.println(sb);
        
        String s = "Salam";
        StringBuilder ss = new StringBuilder(s);
        
        ss.append(" Qasim kisi ");
        ss.append(23);
        System.out.println(s+"\n"+ss);
        
    }
    
}
