package Strings_Arrays_ArrayLists;

/**
 *
 * @author Mustafa <mustafa260794@gmail.com>
 */
public class TestArrays extends BaslangicTest {

    public static void main(String[] Qulam) {
        int[][] a = new int[3][];
        a[0] = new int[9];
        a[1] = new int[2];
        a[2] = new int[5];

        int[] g = a[0];
        for (int i = 0; i < g.length; i++) {
            System.out.println(g[i]);
        }

        int[][][] b = new int[4][][];
        b[0] = new int[4][];
        b[0][1] = new int[9];
//        b[1][0] = new int [5]; <-- runtime nullpoint exception verir :D cunki 1-e hecne vermemiwem axi

        
        int[][] avdilla = {{1, 4, 5}, {3, 5, 76, 78}, {4, 5, 3, 2}};
        System.out.println(avdilla[0]);

        
        int[] anonim = new int[]{1, 2, 3};
        System.out.println(anonim[1]);

        
        BaslangicTest[] bt = new TestArrays[3];
        bt[0] = new TestArrays();
//        bt[1] = new BaslangicTest(); <-- runtime exception new TestArrays[3] verilib axi.
//        BaslangicTest bbb = new BaslangicTest();
//        bt[2] = bbb;

//        System.out.println(bt[-1]); <-- burda runtime exception olur. -1 verildiyinden

        yoxlama(new int[]{2, 3, 4, 5});

    }

    public static void yoxlama(int[] array) {
        System.out.println("ciz biz");
    }

}
