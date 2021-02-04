package org.sample.numberutils;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class TestNumbers4ParameterizedNamedTest {

    public TestNumbers4ParameterizedNamedTest(String data)
    {
        this.data = data;
    }

    @Parameterized.Parameters(name = "{0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
//                {"data1",},
//                {"data2"},

        });
    }

    private String data;

    @Test
    public void ignoredInJunit4() {
        System.out.println(data);
    }
}
