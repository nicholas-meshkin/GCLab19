package gcLab19;

import java.util.HashMap;

public class FreqAlgorithm {

	public static void main(String[] args) {

		int[] myNums = { 5, 6, 8, 7, 5, 2, 5, 6, 3, 1, 5, 7, 8, 1, 2, 3, 5, 7, 10, 3, 5, 7, 4, 0, 6, 6, 0, 10 };
		arrayFreq(myNums);
		hashMapFreq(myNums);
	}

	public static void hashMapFreq(int[] myNums) {
		HashMap<Integer, Integer> myNumFreq = new HashMap<>();
		for (int i = 0; i < myNums.length; i++) {
			if (myNumFreq.containsKey(myNums[i])) {
				myNumFreq.put(myNums[i], myNumFreq.get(myNums[i]) + 1);
			} else {
				myNumFreq.put(myNums[i], 1);
			}
		}
		int n = 0;
		for (int i = 0; i < myNums.length + n; i++) {
			if (myNumFreq.containsKey(i)) {
				System.out.println(i + " : " + myNumFreq.get(i));
			} else {
				n++;
			}
		}
		// Big-O estimate would be O(n) due to non-nested loops
	}

	public static void arrayFreq(int[] myNums) {
		int[] myNumFreq = new int[11];
		for (int i = 0; i < myNums.length; i++) {
			myNumFreq[myNums[i]]++;
		}
		for (int i = 0; i < myNumFreq.length; i++) {
			if (myNumFreq[i] > 0) {
				System.out.println(i + " : " + myNumFreq[i]);
			}
		}
		// Big-O estimate would be O(n) due to non-nested loops
	}
}
