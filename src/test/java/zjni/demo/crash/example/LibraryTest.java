package zjni.demo.crash.example;

import org.junit.Test;

public class LibraryTest {

    @Test
    public void callAndCrash() {
        new Library().callAndCrash();
    }
}