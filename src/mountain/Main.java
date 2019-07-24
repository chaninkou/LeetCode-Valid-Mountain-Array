package mountain;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] A = {0,1,2,3,2,1};
		
		System.out.println("Input: " + Arrays.toString(A));
		
		CheckMountainArrayFunction solution = new CheckMountainArrayFunction();
		
		System.out.println("Solution: " + solution.validMountainArray(A));
	}
}
