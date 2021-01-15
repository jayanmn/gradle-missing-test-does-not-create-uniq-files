package org.sample.numberutils;


import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class TestNumbers4IgnoredAtMethodLevelParameterizedTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"data1",},
                {"data2"},

        });
    }

    private String data;

    @Test
    @Ignore
    public void ignoredInJunit4() {
        System.out.println(data);
    }
}
