//OCA Objective 1.2 and OCP Objective 2.5
package Decleration_and_AccessControl_1;

import java.lang.Integer;
/**
 * -enumlar classin xaricinde ayriliqda ve ya class daxilinde verile biler ancaq metod daxilinde enum tanimlamaq OLMAZ!
 * -enumlar public ve default ola biler private ve protected ola bilmez!
 * -enumlarin daxilindekiler ne stringlerdi nede int! onlar bir nov senin tiplerindi!
 * -her bir enumun static values() metodu varki enumda tanimlandigi sira daxilindeki parametrleri sene geri qaytarir;
 * 
 * -enumlarin iceriklerine qiymet verdikde awagidaki kimi avtomatik konstruktor yaradilmasini teleb edir. Konstruktor verdiyin qiymete gore parametr qebul edir
 * -enumlarin konstruktoruna bir bawa muraciet etmek olmur. Biz enumu cagirdiqda icindeki type-lari o ozu avtomatik construktoru cagiri qiymeti vererek;
 * -enumlarinda konstruktorlarini istediyimiz kimi overload ede bilerik;
 * -tiplerin daxiline istediyimiz qeder qiymet yaza bilerik ancaq ona uygun konstruktor yaratmaq werti ile;
 * -enum tiplerin qaabginda {} qoyub daxilinde kodlarda yaza bilerik metod overwrite etmek filan;
 * 
 * ENUMLARdan anladigim: enumu tanidib icine istediyimiz tipleri deyekde adina icini doldururuq, eger qiymet vermezsek konstruktor yaratmaga gerek yoxdu
 * yox eger tiplere qiymet veririkse onda tiplere verdiyimiz qiymet hansi tipdedise o tipleri goturen konstruktor yaradiriq:
 * burdan geldiyim netice enumlari cagirib tipi secdikde meselen enumum.BIG bu bigi goturur eger enumun altinda kodlar yazmiwamsa
 * class kimi o kodlari iwledir ve BIG-e gore iwleyir o kodlar. Bu qeder;
 * 
 */

public class DeclareAndUseEnums_5 {
    int ch=54;
    
    CoffeSize cs;
    public static void main(String[] args) {
        cizbiz myCizBiz = new cizbiz();
        myCizBiz.m = cizbiz.my.HA;
        
        
        DeclareAndUseEnums_5 d = new DeclareAndUseEnums_5();
        d.cs = CoffeSize.BIG;
        
        DeclareAndUseEnums_5 d2 = new DeclareAndUseEnums_5();
        d2.cs = CoffeSize.OVERWHELMING;
        
        System.out.println(d.cs.getOnce()+" "+ d2.cs.getOnce());
        
        int cdd = CoffeSize.cdds;
        
        for(CoffeSize cs : CoffeSize.values())
        System.out.println(cs +" "+ cs.getOnce()+"  "+cs.getLidCode());
    }
}


enum CoffeSize{
    BIG(3, "a"),    HUGE(4, "b"){
    @Override
    public String getLidCode(){
    return "A";
    }   },
    OVERWHELMING(5, "c");

    public final static int cdds=8;
    private CoffeSize() {
    }
    
    CoffeSize(int once, String c){
    this.once = once;
    }
    
    CoffeSize(int once) {
        this.once = once;
    }
     private int once;
     
     public int getOnce(){
     return once;
     }
     
     public String getLidCode(){
     return "B";
     }
}

class cizbiz{
enum my{HA, HAS};
my m;

}
