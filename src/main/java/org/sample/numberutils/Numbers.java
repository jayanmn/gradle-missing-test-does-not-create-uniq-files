package org.sample.numberutils;

import net.bytebuddy.ToString;

@ToString
public class Numbers {

    public int add(int left, int right) {
        System.out.println(toString());
        return left + right;
    }

    @Override

    public String toString() {
        return "Numbers::toString ";
    }


    public static void main(String[] args) {
        System.out.println("..." +   new Numbers().toString());

    }
}
