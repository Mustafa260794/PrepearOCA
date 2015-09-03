package Assingnments;

/**
 *
 * @author user
 */
public class TestGarbageCollection {
    static public void main(String... ebdulrehim){
    Runtime run = Runtime.getRuntime();
        System.out.println("Prosessor number; "+run.availableProcessors());
        System.out.println("Max memory :" + run.maxMemory());
        System.out.println("Umumi yaddas: " +run.totalMemory());
        System.out.println("Baslayanda yaddaw: "+run.freeMemory());
        TestGarbageCollection d;
        for(int i=0; i<100000000; i++){
        d  = new TestGarbageCollection();
        d= null;
        }
        System.out.println("Fordan sonra bos yaddas: " + run.freeMemory());
        run.gc();
        System.out.println("GC-dan sonra bow yaddash: " +run.freeMemory());
        
    
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
//        System.out.println("bye bye");
        TestGarbageCollection tt = this;
        //tricky..)
    }
    
    
}
