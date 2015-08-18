// OCA Objectives 2.1, 2.2, 2.3, 2.4, 2.5, 4.1, 4.2, 6.2 and 6.6
package Decleration_and_AccessControl_1;

//NONACCESS MEMBER MODIFIERS

/**
 * -final metodlar classlar extends edilse bele override edile bilmez. Final deyiwenler ise sabit olur yeni qiymet 1 defe verilirse deyiwilmir sonradan
 * -abstract metodlar govdesi olmayan metodlardir. ve medot {}ile yox ;ile bitir. ex: public abstract void doIt();
 * -abstract olmayan classin daxilinde abstract metod tanimlamaq mumkun deyil. sehv verecekdir. abstract metod yazmaq ucun classida abstract olaraq tanimlamaq gerekdir.
 * 
 * -abstract classi adi class(nonabstract) extends etdikde daxilindeki abstract metodlari implement etmek lazimdir yeni tanimlamaq metodu.
 * ancaq abstract classi abstract class extends etdikde subclassin daxilindeki abstract metodlari implement etmesi gerekmir ikinci abstract classi(subclassi) bawqa bir
 * nonabstract(adi) class extends etdiyi zaman her iki classin sub ve super classin daxilindeki abstract metodlari implement etmelidir.
 * -abstract class ozude daxilinde bawqa bir interface-i impelemts vererek implement ede biler ancaq bunu ederken class onun metodlarini implement etmesede olar yeni metodu yazib bodysini yazmasada olar
 * ancaq bawqa bir concret class bu abstract calassi exteds etdiyinde hem abstract classin oz abstact metodlarini hemde interface-lerin metodlarini implement etmelidir.
 * -abstract classlar ozleride adi classlari extends ede bilir!.
 * -bir metod hec bir zaman eyni zamanda abstract ve final ve ya abstract ve private ve ya static ola BILMEZ!
 * -abstract metodlar private-dan bawqa her bir access modifier qebul ede biler! public default protected...
 * 
 * -synchronized modifier ancaq metodlara declare edile biler ve butun access modifier-lerle verile biler(public,private...)
 * -native modifier yalniz metodlara declare edile biler ve metodun govdesi abstract metodlar kimi bow olur ve ;-ile qurtarir
 * - var-args variable argument: metoda tip sonra 3 noqtte ardindan referans verilir. metoda 1-den cox deyiwen verile biler parametr olaraq lakin bir var-args vermek mumkundur ve o en sonuncu olmalidir.
 * 
 * -konstruktorlar class adlari ile eyni olmalidir return type olmur hec zaman! static final ve ya abstract qetiyyen ola bilmez! access modifierlerle iwlene biler, parametrler qebul edir var-args-da verile biler;
 * -deyiwenler 2 cur olur primitivler ve referans deyiwenleri
 * -her deyiwkenin ramda ayrilmasi beledir: bawdan 1 iware biti olur. hansiki 0 olduqda qiymet musbet, 1 olduqda ise menfi olur qiymet
 * ardindan qiymet bitleri gelir ondan deyiwenin tipine gore max qitmeti 2 ustu deyiwenin tipinin biti-1 menfi ve musbet-1 araligi
 * ex: int-32 bit bu edir min qiymet -2^31 max (2^31)-1
 * 
 * -instance variables yeni obyekt deyiwenleri classin altinda verilir ve butun access modifierleri ala biler final ola biler abstract synchronized native filan ola bilmez + static ola bilmez static olsa class variable sayilar;
 * -deyiwenleri final tanitdiqda yeni o deyiweni sabit etmek demekdir 1 defe qiymet aldimi o curde qalir. o qiymeti deyiwmek olmur!
 * 
 * -transient-de  var amma menasiz geldi jvm-e bildirirki serializationda bu detyiwkeni kec. instance variable-lara altadikda
 * -volatile -de modifier-di amma menasi threadlerle baglidi. threadler buna access edende bawqa copylerini silmekdi nedi bilmedim)
 * 
 * -staticlerde melum mesele yalniz 1 copy-si olur. obyekt yaranmamiwdan qabaq staticler yaranir yalniz 1 dene olur qiymeti bir yerde deyiwse her yerde deyiwir.
 * -static metodlar class daxilinde taninmiw instance variable-lardan(yeni daxili deyiwdenkden) directly istifade ede bilmirler.
 * 
 * 
 */
public class DeclareClassMembers_4_2 {
 
    private DeclareClassMembers_4_2(int a){
        System.out.println(a);}
    
    void doThis(int a, String... args){  
    int c = -2_147_483_648;
        c= 2_147_483_647;
    final int h;
    h=5;
//    h=6; sehv
    }
    
    //void doThis(String... has, int a){    }  bu error verecek cunki var args en sonuncu tanimlanmalidir.
}
