package org.sample.numberutils;


 public class TestNumbers3SpecialisedTest extends TestNumbers3GeneralTestcase {

    public void testJunit3Special(){
        System.out.println(this.getClass().getName());
        System.out.println(new Numbers().add(100,2));
    }
}
