//OCA Objectives 1.2, 1.3, 1.4, 6.6, 7.6
package Decleration_and_AccessControl_1;

/**
 * -Bir source file-da yalniz 1 public class ola biler
 * -komment classin her bir yerinde ola biler ferq etmir.
 * -eger public class varsa classin adiyla faylin adi eyni olmalidir. ex: public class dog{} dog.java
 * -istenilen sayda public olmayan class yaratmaq olar bir source file-da
 * -public classi olmayan yalniz nonpublic classlari olan filen istenilen adda ola biler, class adiyla uyum gerekmez.
 * -bir source filen icinde ferqli paketlere ve ya importlara aid olan classlar yaratmaq olmur -
 * bawqa sozle package ve verilen import source file icinde olan butun classlara aiddir.
 * -package adi(olmayada biler) en ustde ondan altda importlar ondan altda class adlari olur. ardicilliq bu curdur.
 * 
 * -javac strukturu beledir: javac [options] [source files]
 * -eger birden cox source file adi verilse javac komandinda adlar ara buraxilaraq yazilir ex: javac dog.java cat.java
 * 
 * -Java Virtual Mashini cagirmaq java komandi ile olur
 * java [options] class [args]  burada options ve args cagirilmasi isteye baglidir (Mecburi deyil).
 * ex: java -version MyClass x 1  --> Istifade olunan jvm-nin versiasini gosterir ardindan MyClassa iki deyiwen gonderir
 * 
 * main() metodu bawqa curde tanimlana biler ancaq public static void main(String[] args) --> jvm bunu esas goturur;
 * main() metodunun ozude overload ola bilir.
 * 
 *- it is free to mix import statemen.
 * -static importlar kod yazmani qisaldir. Beleki import edilen classin icindeki obyektleri goturmek
 * mumkundur STATIC obyektleri, constantlari static metodlari. Static olmayanlari import etmek olmaz.
 * 
 * 
 */

import static java.lang.System.out;
import static java.lang.Integer.*;
//butov java-ni import etmek legaldi ancaq onun daxilindeki paketleri axtarmir  bele.
import java.*;


public class DefineClasses_2 {
    
    //special metodlari awagidaki novlerde yazmaq olar:
//    public static void main(String[] args) {}
//    static public void main(String[] args){}
//    public static void main(String... x){}
    static public void main(String czzz_has_dz[]){
    //System.out.println() evezine sadece out yazdiq. static importa gore...
    out.println("Hass");
        toHexString(34);

    }
    
    
    //bu Special main metod sayilmir.
    private void main(){}
    
       
}

//burda public class czz{..} yaranmaz