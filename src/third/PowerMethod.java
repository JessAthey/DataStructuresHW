package third;

public class PowerMethod {
	
	public static int[] toPower(int size, int power) {
		int[] result = new int[size];
		for(int i = 0; i<size; i++) {
			result[i] = (int) Math.pow(i, power);
		}
		return result;
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int[] resultArray = toPower(8,4);
		for(int i=0; i<resultArray.length; i++) {
			System.out.print(resultArray[i] + " ");
		}
		
		
	}

}
