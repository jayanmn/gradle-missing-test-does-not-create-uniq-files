package org.sample.numberutils;


import org.junit.Assert;
import org.junit.Test;


public class TestNumbers4WithAssertionTest {

    public void TestNumbers3EmptyTest() {
        System.out.println(new Numbers().add(1, 2));
    }


    @Test
    public void ignoredInJunit4() {
        String someNull = null;
        Assert.fail("just failed");
    }
}
