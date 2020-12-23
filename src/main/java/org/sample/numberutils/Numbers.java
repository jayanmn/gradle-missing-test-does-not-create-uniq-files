package org.sample.numberutils;


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
