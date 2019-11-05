/**
 * 
 */
package com.lloydbriantech.demo.junit;

import java.util.ArrayList;
import java.util.List;

/**
 * Sample Class to be unit tested
 *  
 * 
 */
public class ClassToJUnit {
	private int sum;
	private int average;
	private int a;
	private int countOfInts = 0;
	List<Integer> numbersInData = null;
	
	public ClassToJUnit() {
		initialize();
	} 
	private void initialize() {
		numbersInData = new ArrayList<Integer>();
		sum = 0;
		average =0;
	}
	
	public void MysteryMethod(int a, int b) {
		sum = a;
		average = b;
		initialize();
	}
	
	public void addNumberToList(int a) {
		numbersInData.add(new Integer(a));
	}
	
	public void removeNumberFromList(int b) {
		numbersInData.remove(a);
	}
	
	public void computeSum() {
		int sum = 0;
		for (Integer n : numbersInData) {
			sum += n;
		}
	}
	
	public void computeNumberOfInts() {
		countOfInts = numbersInData.size();
	}
	
	public int getAverage() {
		a = sum;
		if(countOfInts <= 0) {
			return 0;
		} else {
			return sum/countOfInts;
		}
	}
}