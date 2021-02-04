package org.sample.numberutils;


import org.junit.Test;


public class TestNumbers4CallsExitTest {

    @Test
    public void exitCalledHere() {
        System.out.println(new Numbers().add(1, 2));
       // System.exit(-1);
    }
}
