//OCA Objectives 6.1 and 6.7
package Object_Orientation;

/**
 *
 * Encapsulyasiya sadece classin daxilindeki verilenleri gizledib yeni private
 * edib onlara eriwimi getter setter vasitesi ile heyata kecirmekdir. ex:
 */
public class Encapsulation {

    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
 
    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

}
