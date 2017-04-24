package ru.job4j.calculator;

/**
 *Class Calculator.
 *@author dolinovd
 *@since 20.04.2017
 *@version 1
*/

public class Calculator {
   /**
   */
   private double result;
    /**
		* Конструктор, выврл строки в консоль.
		* @param first - первое число.
		* @param second - второе число.
	*/
    public void add(double first, double second) {
		this.result = first + second;
    }
	/**
		* Конструктор, выврл строки в консоль.
		* @param first - первое число.
		* @param second - второе число.
	*/
	public void substract(double first, double second) {
		this.result = first - second;
	}
	/**
		* Конструктор, выврл строки в консоль.
		* @param first - первое число.
		* @param second - второе число.
	*/
	public void div(double first, double second) {
		this.result = first / second;
	}
	/**
		* Конструктор, выврл строки в консоль.
		* @param first - первое число.
		* @param second - второе число.
	*/
	public void multiple(double first, double second) {
		this.result = first * second;
	}
	    /**
		* @return - возвращает значение вычисления сложения
	*/
    public double getResult() {
        return this.result;
    }
}