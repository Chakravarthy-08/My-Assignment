package week1.day2;

public class Car {
	
	public void printCarBrand() {
		System.out.println("Benz");
		
	}
	
	public String getCarColour() {
		return "Black";
	}
		
		public int getCarEngineNumber() {
			return 987654;
		}
		
		public int subTwoNumber(int a, int b) {
			int c =a-b;
			return c;
		}
		public int multipleTwoNumber(int a, int b) {
			int c = a*b;
			return c;
		}
		public int divideTwoNumber(int a, int b) {
			int c = a/b;
			return c;
		}
		public static void main(String[] args) {
			
			Car obj =new Car();
			obj.printCarBrand();
			String colour=obj.getCarColour();
			System.out.println(colour);
			int number=obj.getCarEngineNumber();
			System.out.println(number);
			int sub=obj.subTwoNumber(40, 20);
			System.out.println(sub);
			int multiple=obj.multipleTwoNumber(40, 20);
			System.out.println(multiple);
			int divide=obj.divideTwoNumber(40, 20);
			System.out.println(divide);
			
			
		
		}
		
		
			
		

		
		
	
	

}
