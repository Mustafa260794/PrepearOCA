package Operators;
/**
 *
 * @author Mustafa
 */
public class IncrementDecrement {
    static int user;
    public static void main(String[] args) {
//        int user; <--bele verilse sehv verer axi instance variable deyil localdi...
        System.out.println("Istifadeci daxil oldu: "+ user++);
        System.out.println("Istifadeci sayi: "+ user);
        System.out.println("Daha biri daxil oldu: "+ ++user);
        
        System.out.println("Men"+ ++user + ++user);
        
    }
}
