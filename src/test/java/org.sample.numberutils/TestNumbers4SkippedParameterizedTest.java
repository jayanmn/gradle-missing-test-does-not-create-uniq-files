package org.sample.numberutils;


import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;



@RunWith(Parameterized.class)
public class TestNumbers4SkippedParameterizedTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data()
    {
        return Arrays.asList(new Object[][]{
                {"capital.iap_xml", "sp_capital.iap_xml"},
                {"vesys.iap_xml", "sp_vesys.iap_xml"},

        });
    }


    private String main;
    private String dependency;

    public void TestNumbers3EmptyTest () {
        System.out.println(new Numbers().add(1,2));
    }


    @Test
    @Ignore
    public void ignoredInJunit4(){
        System.out.println(main);
    }
}
