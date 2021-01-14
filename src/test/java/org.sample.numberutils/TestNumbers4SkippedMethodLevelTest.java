package org.sample.numberutils;


import org.junit.Ignore;
import org.junit.Test;




public class TestNumbers4SkippedMethodLevelTest {
    public void TestNumbers3EmptyTest () {
    }


    @Test
    @Ignore
    public void ignoredInJunit4(){
        System.out.println(new Numbers().add(1,2));
    }
}
