package org.sample.numberutils;


public class NotATestButClassEndingInTest {

    public  void setUp() {
        System.out.println("Nothing in test actually");
    }
    public void notAtest(){
        System.out.println(new Numbers().add(1,2));
    }
}
