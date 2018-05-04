package com.drpicox.tddCalculator;

// DO NOT USE javax.script.ScriptEngine or similars

// DO NOT RENAME NEITHER MOVE THIS FILE
// it must be com.drpicox.tddCalculator.TddCalculator
public class TddCalculator implements Calculator {

    // DO NOT CHANGE THIS CONSTRUCTOR SIGNATURE
    // (it must be a public constructor with no arguments)
    public TddCalculator() {
        // here you can add your implementation
    }

    @Override
    public void input(char c) {
        // here you can add your implementation
        // use auxiliar functions/classes if you need
        throw new IllegalArgumentException("Unknown input '"+ c +"'");
    }

    @Override
    public int getDisplay() {
        // here you can add your implementation
        // use auxiliar functions/classes if you need
        return 0;
    }

}
