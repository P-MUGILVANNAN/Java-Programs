// Java code to print the above pattern

import java.util.*;

class PatternGenerator {

	// Function to print the pattern
	public static void printPattern(int n)
	{
		List<List<Integer> > list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}

		int num = 1;

		// First Traversal top to bottom
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				list.get(i).add(num++);
			}
		}

		// Second Traversal bottom to top
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < n - i; j++) {
				list.get(i).add(num++);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int ch = 0; ch < (i * 2); ch++) {
				// '-'s is printed before each row
				// in a increasing order
				System.out.print(' ');
			}
			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.print(list.get(i).get(j));
				if (j != list.get(i).size() - 1) {
					// * is not printed after
					// the last element in a
					// row
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		int N = 3;

		// Function call
		printPattern(N);
	}
}
