/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assingnments;

/**
 *
 * @author Mustafa Aslanov
 */
public class TestTest {
    TestTest(int x, TestTest p){
    id=x;
    t=this;
    if(p!=null) t=p;
    }
    
    int id;
    TestTest t;
    
    static public void main(String... EliEhmed){
    TestTest t1 = new TestTest(1, null);
    t1.go(t1);
    }
    
    void go(TestTest t1){
    TestTest t2 = new TestTest(2, t1);
    TestTest t3 = new TestTest(3, t2);
        System.out.println(t3.t.t.t.t.t.t.t.t.t.t.t.t.t.t.id); //:D
    }
}
