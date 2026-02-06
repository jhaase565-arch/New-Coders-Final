package main.java;

import java.util.Arrays;

public class ForLoop {

	int ansCheckArr[] = new int[8];
	int indexOfAnaArr = 0; // sorry

		// Create a for loop that goes through the values 5 to 12. (use 'i' for the itorator)
		// please note that you don't need to create the for loop body
		public void forLoop() {

			// EDIT BELOW HERE

			for () // edit here 
				
			// EDIT ABOVE HERE

			{
				ansCheckArr[indexOfAnaArr++] = i;
			}

		}


	public boolean checkCorrect() {
		int[] correctAns = {5 , 6 , 7 , 8 , 9 , 10 , 11 , 12};
		return Arrays.equals(ansCheckArr , correctAns);
	}
}
