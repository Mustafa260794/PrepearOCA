package Operators;

/**
 *
 * @author Mustafa
 */
public class ConditionalOperator {
    public static void main(String[] qulam) {
        int a=-1;
        String s = (a>1) ? "Ataw boyukduye birden..." : (a==1) ? "Ataw beraberdiey bire" :
                "Ataw kicikdiey birden...";
        System.out.println(s);

        
        
        //bu ayri bir sey
        String ss = "hello";
    ss = ss.substring(0, 1).toUpperCase() + ss.substring(1);
        System.out.println(ss);
    }
}
