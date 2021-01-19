package org.sample.numberutils;


import org.junit.Test;


public class TestNumbers4WithNPETest {

    public void TestNumbers3EmptyTest() {
        System.out.println(new Numbers().add(1, 2));
    }


    @Test
    public void ignoredInJunit4() {
            String someNull = null;
            someNull.isEmpty();//fail with NPE
    }
}
