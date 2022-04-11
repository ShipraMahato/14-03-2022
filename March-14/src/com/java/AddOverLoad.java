package com.java;
public class AddOverLoad
{  int x; int y; int s;
	void add(int x,int y) {
	s= x+y;
	System.out.println("Sum of two integer type data is : "+ s);
}

	void add(float x,float y) {
		float s= x+y;
		System.out.println("Sum of two float type data is : "+ s);
	}
	void add(double x,double y) {
		double s= x+y;
		System.out.println("Sum of two double type data is : "+ s);
	}
	
	public static void main(String[] args) {
		AddOverLoad A = new AddOverLoad();
		A.add(2,5);
		A.add(4.5f, 3.4f);
		A.add(33.4d, 23.6d);
	}

}
