/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assingnments;

/**
 *
 * @author user
 */
public class LiteralsTest {
    public static void main(String[] args) {
        int a = 0b10111111111111111111111111111111;//<--3 0b ve ya 0B ile bawlamalidir
        int b = 010;
        int c = 0xfffffff0;
        double d = 34.00/36.0d;
        char letter = '\uF3FF';
        char ch = 'ə';
        char herf = (char) -65453;
        byte by =(byte) 20000;
        System.out.println("ikilik: "+a+"\n8-lik say sistemi: "+b
        +"\n16-liq say sistemi: "+c+"\n"+d+"\n"+letter+" "+((int)ch)+"\n"+herf);
        
        System.out.println(by);
        
        float flo = 34.54f;
        
        short sh = (short) flo;
        
        System.out.println(sh);
        
        byte byt = 125;
        byt += 10;
        System.out.println(byt);
        
        int birinci = 10;
        int ikinci =birinci;
        birinci += 10;
        System.out.println("birinci:"+birinci+ " Ikinci: "+ikinci);
        
    }
}
