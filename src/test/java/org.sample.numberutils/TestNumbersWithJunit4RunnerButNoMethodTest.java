package org.sample.numberutils;


import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;


@RunWith(BlockJUnit4ClassRunner.class)
public class TestNumbersWithJunit4RunnerButNoMethodTest {
    @Before
    public  void setUp() {
        System.out.println("Nothing in test actually");
    }
    public void notAtest(){
    }
}
