package second;

public class WhatDoesItDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] exampleArray = {1,5,6,5,4,1};
		double maximum = exampleArray[0];
		int index = 0;
		for(int i=1; i<exampleArray.length; i++) {
			if(exampleArray[i] > maximum) {
				maximum = exampleArray[i];
				System.out.println(exampleArray[i]);
				index = i;
			}
		}
		System.out.println(index);
	}

}


//Before I corrected the errors it just printed out an error message. 
//After corrections it prints the number 2 which is the 
//location(index) of the largest number in the array (6)