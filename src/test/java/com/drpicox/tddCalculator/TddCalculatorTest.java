package com.drpicox.tddCalculator;

import com.drpicox.tddCalculator.helper.CalculatorValidatorHelper;
import org.junit.Before;
import org.junit.Test;

// DO ONE COMMIT at least for each @Test 
// and also for each refactor

public class TddCalculatorTest {

    private CalculatorValidatorHelper validatorHelper;

    @Before
    public void setUp() {
        validatorHelper = new CalculatorValidatorHelper();
    }

    @Test
    public void numberInput() {
        assertThatCalculatorComputes("[0]");
    }

    /*
    @Test // 1
    public void numberInput() {
        assertThatCalculatorComputes("[0]");
        assertThatCalculatorComputes("1[1]");
        assertThatCalculatorComputes("12[12]");
        assertThatCalculatorComputes("012[12]");
    }

    @Test // 2
    public void numberAddition() {
        assertThatCalculatorComputes("1+2=[3]");
        assertThatCalculatorComputes("12+23=[35]");
    }

    @Test // 3
    public void numberSubstraction() {
        assertThatCalculatorComputes("2-1=[1]");
        assertThatCalculatorComputes("23-12=[11]");
    }

    @Test // 4
    public void numberMultiplication() {
        assertThatCalculatorComputes("2*3=[6]");
        assertThatCalculatorComputes("11*12=[132]");
    }

    @Test // 5
    public void numberDivision() {
        assertThatCalculatorComputes("6/2=[3]");
        assertThatCalculatorComputes("132/11=[12]");

    }

    @Test // 6
    public void operatorConcatenation() {
        assertThatCalculatorComputes("1+2+3=[6]");
        assertThatCalculatorComputes("1+2-3=[0]");
        assertThatCalculatorComputes("1*2*3=[6]");
        assertThatCalculatorComputes("3*4/2=[6]");
    }

    @Test // 7
    public void operatorPrioritiesForward() {
        assertThatCalculatorComputes("1+2*3=[7]");
        assertThatCalculatorComputes("1-2*3=[-5]");
        assertThatCalculatorComputes("1+9/3=[4]");
        assertThatCalculatorComputes("1-9/3=[-2]");
    }
    
    @Test // 8
    public void operatorPrioritiesBackward() {
        assertThatCalculatorComputes("2*3+1=[7]");
        assertThatCalculatorComputes("2*3-1=[5]");
        assertThatCalculatorComputes("9/3+1=[4]");
        assertThatCalculatorComputes("9/3-1=[2]");
    }

    @Test // 9
    public void operatorPrioritiesNested() {
        assertThatCalculatorComputes("1+2*3*4=[25]");
        assertThatCalculatorComputes("2*3*4+1=[25]");
        assertThatCalculatorComputes("2*3+4*5=[26]");
        assertThatCalculatorComputes("1-2*3*4=[-23]");
        assertThatCalculatorComputes("2*3*4-1=[23]");
        assertThatCalculatorComputes("2*3-4*5=[-14]");
        assertThatCalculatorComputes("6/3+20/4=[7]");
        assertThatCalculatorComputes("6/3-20/4=[-3]");
    }

    @Test // 9.5
    public void operatorsWithoutInputs() {
        assertThatCalculatorComputes("+1=[1]");
        assertThatCalculatorComputes("1+=[2]");
        assertThatCalculatorComputes("+=[0]");
    }

    @Test // 10
    public void peekDisplay() {
        assertThatCalculatorComputes("1[1] +[1] 2[2] *[2] 3[3] =[7]");
        assertThatCalculatorComputes("1[1] -[1] 9[9] /[9] 3[3] =[-2]");
        assertThatCalculatorComputes("2[2] *[2] 3[3] -[6] 1[1] =[5]");
        assertThatCalculatorComputes("9[9] /[9] 3[3] -[3] 1[1] =[2]");
    }
    */

    private void assertThatCalculatorComputes(String e) {
        var calculator = new TddCalculator();
        validatorHelper.validate(calculator, e);
    }

}
