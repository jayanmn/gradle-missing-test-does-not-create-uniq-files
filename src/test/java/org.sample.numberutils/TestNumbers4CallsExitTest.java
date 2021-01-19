package org.sample.numberutils;


import org.junit.Test;


public class TestNumbers4CallsExitTest {

    public void TestNumbers3EmptyTest() {
        System.out.println(new Numbers().add(1, 2));
    }


    @Test
    public void exitCalledHere() {
            System.exit(-1);
    }
}
