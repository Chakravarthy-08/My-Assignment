package Week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueNumber {
	
	public static void main(String[] args) {

		String text = "Chakra";

		//Convert String to Character array
		for(int i=0; i < text.length(); i++) {
		char c = text.charAt(i);
		System.out.println(c);

		}
		//Create a new Set -> HashSet
		Set<Character> name = new HashSet<Character>();

		//Add each character to the Set and if it is already there, remove it
		name.add('C');
		name.add('h');
		name.add('a');
		name.add('k');
		name.add('r');
		name.add('a');
		

		//print the set
		System.out.println("Unique characters are:" +name);



		}

		}
