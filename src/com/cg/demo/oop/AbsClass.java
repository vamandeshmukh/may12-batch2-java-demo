package com.cg.demo.oop;

// abstract class 
public abstract class AbsClass {

	// abstract method
	abstract void absMethod();

	// concrete method
	// method signature - what does this method do?
	void addNums(int i, int j)
	// method body - how does it do it?
	{
		int k = i + j;
		System.out.println(k);
	}

}
