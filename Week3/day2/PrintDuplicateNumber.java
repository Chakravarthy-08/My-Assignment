package Week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumber {
	
	
public static void main(String[] args) {

int[] data = {4,3,6,8,29,1,2,4,7,8};

Set<Integer> Set = new TreeSet<Integer>();

System.out.println("Duplicate Numbers");

for (int i=0; i < data.length; i++) {
if(Set.contains(data[i])) {
System.out.println(data[i]);
}
else {
Set.add(data[i]);
}



}









}

}