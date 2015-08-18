//OCA Objective 7.6
package Decleration_and_AccessControl_1;

/**
 * -interfaceler abstrac classlara oxwardi ancaq abstract classlarda nonabstract metodalar yazmaq olsada interface-lerde bunu etmek olmur
 * -interfacelerdeki metodlar public olmalidir! Interface-de metoda public filan yazilmasi onemli deyil cunki jvm onu public abstract goturur
 * ex: interface my{  void myMethod();  } --> JVM: public abstract void myMethod();
 * -interface daxilindeki butun deyiwkenler public, static veya final olmalidir. bawqa sozle interfaceler yalniz constant deyiwken qebul edir
 * -Interface-lerde metodlar static ola bilmez!
 * -interface metodlari abstract olduqlarina gore onlar final, strictfp ve ya native ola bilmezler
 * -interface bir veya daha cox bawqa interface-leri miras ala biler
 * -interface bawqa class ve ya interface-leri implement ede bilmez
 * -interface bawqa bir interface-e varislikle bir wey vere bilmez
 * -interface-ler interface acar sozu ile tanimlanir
 * -interface tipleri polimorfizimde iwledile biler.
 * -interface-i belede tanimlamaq olar. public abstract interface rol{ } - ile - public interface rol{ } eynidi prinsipce. abstract yazilmazsada olar
 * -interfaceleri awagidaki kimi tanimladiqda sehv verir:
 * final void bon();
 * static void bon();
 * private void bon();
 * protected void bon();
 * 
 * -bu formada tanimlamaq ise legaldir:
 * void bon();
 * public void bon();
 * abstract void bon();
 * public abstract void bon();
 * abstract public void bon();
 * 
 * interface-de deyiwenler verile biler ve mutleq wekilde public static final olmalidir o sabitler!
 * -interface-i imlement etmiw class constanti alir lakin onu deyiwe bilmez! (read-only)
 * -interface daxilinde constanti nece tanimlasanda ex: int CV=12; or static int CV=23; java bunu public static final int CV=23; kimi qebul edir.
 * 
 * -IMPORTANT interfacede metodu tanidanda public yazilmasa bele qabagina onu implement etdikde metod mutleq wekilde public yazilmalidir qabagina!
 * 
 * 
 */
public class UseInterfaces_3 {
    
}
