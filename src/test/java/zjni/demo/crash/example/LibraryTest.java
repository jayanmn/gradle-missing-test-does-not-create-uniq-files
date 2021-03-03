package zjni.demo.crash.example;

import jni.demo.crash.example.Library;
import org.junit.Test;

public class LibraryTest {

    @Test
    public void callAndCrash() {
        new Library().callAndCrash();
    }
}