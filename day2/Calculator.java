package week1.day2;

public class Calculator {
	
	public int addThreeNumber (int num1, int num2, int num3) {
		
		int sum = num1+num2+num3;
		return sum;
		
	}
	
	public int subTwoNumber(int num1, int num2) {
		
		int c = num1-num2;
		return c;
		
		
	}
	
	public double mulTwoNumber (double num1, double num2) {
		
		double d = num1*num2;
		return d;
		
	}
	public float divideTwoNumber (float num1, float num2) {
		
		float e = num1/num2;
		return e;
	}
	
	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		int sum = obj.addThreeNumber(20, 30, 40);
		System.out.println(sum);
		int c = obj.subTwoNumber(20, 30);
		System.out.println(c);
		double d = obj.mulTwoNumber(20,  30);
		System.out.println(d);
		float e = obj.divideTwoNumber(20, 30);
		System.out.println(e);
		
	
		
	
	
		
	
		
		
				
	}

}
