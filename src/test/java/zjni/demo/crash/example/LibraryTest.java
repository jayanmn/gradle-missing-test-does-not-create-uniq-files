package jni.demo.crash.example;

import example.LibraryCaller;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void callAndCrash() {
        new Library().callAndCrash();
    }
}