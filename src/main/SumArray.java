package main;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {1, 2, 3, 4, 5};
		
		int mySum = 0;
		
		for(int i=0; i<myArray.length; i++) {
			mySum += myArray[i];
		}
		
		System.out.println("Sum is: " + mySum);
	}

}
