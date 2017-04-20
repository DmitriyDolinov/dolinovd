package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Dmitriy Dolinov (mailto:dolinov91@gmail.com)
* @version $Id$
* @since 0.1
*/

public class CalculatorTest {
	/**
	* Test add.
	*/
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	/**
	* Test add.
	*/
    @Test
	public void whenDivSixdivTwoThenThree() {
        Calculator calc = new Calculator();
        calc.div(6D, 2D);
        double result = calc.getResult();
        double expected = 3D;
        assertThat(result, is(expected));
    }
/**
	* Test add.
	*/
    @Test
	public void whenSubstractOneMinusOneThenZero() {
        Calculator calc = new Calculator();
        calc.substract(1D, 1D);
        double result = calc.getResult();
        double expected = 0D;
        assertThat(result, is(expected));
    }
	/**
	* Test add.
	*/
    @Test
	public void whenMultipleSixMultTwoThenTwelve() {
        Calculator calc = new Calculator();
        calc.multiple(6D, 2D);
        double result = calc.getResult();
        double expected = 12D;
        assertThat(result, is(expected));
    }
}


