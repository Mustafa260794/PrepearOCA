//OCA Objectives 1.2, 1.3, 1.4, 6.6, 7.6
package Decleration_and_AccessControl_1;

/**
 * -classlarin yaradilmasi, tanimlanmasi:
 * -class MyClass{} bu cur yarana biler, bundan elave tanimlamalarda verile biler evveline. Tanimlamalar iki cur olur:
 * -Giriw(Eriwim) tanimlamalari (public, private, protected)
 * -Qeyri giriw tanimlamalari (final, abstract, strictfp)
 * -Oracle-in meslehet gorduyu paket adlandirilmasi ters domen yaziliwidir ve ardindan proyekt adi ex: com.myDomain.myProject
 * 
 * -tanimlamada eger class evveline hec bir wey yazilmirsan ex: class israfil{} --> bu tanimlama paket seviyyesinde tanimlamadir
 * bawqa paketde olan class bu classdan istifade ede bilmez. Obyektini ala ve ya varislik gotire bilmez
 * -public tanimlama melum oldugu kimi class her yerde istifade oluna biler. JAVA Universde.
 * 
 * -nonaccess final, strictfp, abstract --> public final strictfp verile biler. strictfp classdaki metodlar IEEE 754 standartina uygun olacaq
 * -bir class hem final hemde abstract ola bilmez. final strictfp ola biler eyni anda
 * -final classlar o classlardiki onlardan extend etmek olmur. bir class final-disa daxilindeki hec bir metod overwite edile bilmez
 *
 * -abstract classlar finallarin eksine extend elemek mumkundur lakin obyektini almaq mumkun deyildir. daxilinde abstract metodlar yazmaqda olar
 * bu classlar interface-den ferqli olaraq metodlarin icini doldurmaqda bowda buraxmaq olar.
 * -new sozu ile abstract classlarin obyektini aldiqda obyekti yox anonim subclassin obyekti alinir.
 * ex: DefineClasses2 df = new DefineClasses2(){}; bir anonim subclass yaranir ve df-e referans edilir.
 * 
 * 
 */
public strictfp abstract class DefineClasses2_2 {
    private int qiymet;
    private int camiw;
     public void goSlow(int a){
         System.out.println("Go slow"+a);
     }
    
    public abstract void goFast();
    
}


