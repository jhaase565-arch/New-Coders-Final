package main.java;

public class Logic {
    final int CODE = 3;
    int result = 0;

    // DO NOT EDIT
    boolean a = false, b = true, c = false, d = false, e = true;

    // DO NOT EDIT
    boolean ab = a && b;
    boolean cd = !(c || d);
    boolean abe = ab && e;

    // Replace false in each of the following booleans with a boolean expression like those that define ab, cd, and abe
    // You must use actual boolean expressions, not just boolean values, and you must use one of each of the following: and gate, or gate, not gate
    boolean one = false;
    boolean two = false;
    boolean three = false;
    boolean four = false;

    public boolean checkCorrect() {
        if(one) { result++; }
        if(two) { result++; }
        if(three) { result++; }
        if(four) {result++; }

        return result == CODE;
    }

    public Logic() {}
}