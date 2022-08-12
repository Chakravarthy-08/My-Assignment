package week1.day2;

public class PrintDuplicatesInArray {
	
	public static void main(String[] args) {
		
		// here the input
		
		int[] arr1 = {14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20};
		
		//iterate from 0 to the array length-1 
		
		for (int i=0; i<arr1.length; i++) {
			
			//assign 0 to count
			
			int count = 0;
			
			//iterate from i to the length of the array by adding 1
			
			for(int j = i+1; j<arr1.length; j++) {
				
				//compare both the loop variables & check there are equal
				
				if(arr1[i] == arr1[j])
					
					//increase the count if both the arrays are equal
					
					count++;
				
				//out of the inner loop, check and print the first array variable if count is more than 0
				
				
				
				
				
			}
			
			if (count != 0) {
				
				System.out.println(arr1[i]);
				
			
			}
		}
		
		
		
	}

}
