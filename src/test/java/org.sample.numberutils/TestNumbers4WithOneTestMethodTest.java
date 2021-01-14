package org.sample.numberutils;


import org.junit.Test;

public class TestNumbers4WithOneTestMethodTest {

    public void TestNumbers3EmptyTest () {

    }


    @Test
    public void ignoredInJunit4(){
        System.out.println(new Numbers().add(1,2));
    }
}
