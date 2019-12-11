package demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Solution {
	static PrintWriter pw;
	static BufferedReader br;
	static StringTokenizer st;

	static int T, N;

	static int[] minArray;
	static int[] maxArray;
	static int[] array; // original array

	public static void main(String args[]) throws Exception {

		//System.setIn(new FileInputStream("C:\\Users\\roy.ng\\Downloads\\sample_input(A life of smart investment).txt"));

		pw = new PrintWriter(System.out, true);
		br = new BufferedReader(new InputStreamReader(System.in));

		//////// Your algorithm is implemented here. ////////

		double start = System.nanoTime();
		
		/** Implement a max array and min array to keep track **/
		T = nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			pw.print("#" + test_case + " ");
			N = nextInt();
			init();
			for (int i = 0; i < N; i++)
				array[i] = nextInt();

			// process min
			for (int i = 0; i < N; i++) {
				if (i == 0)
					minArray[i] = array[i];
				else {
					if (array[i] < minArray[i - 1])
						minArray[i] = array[i];
					else
						minArray[i] = minArray[i - 1];
				}
			}
			// process max
			for (int i = N-1; i >= 0; i--) {
				if (i == N-1)
					maxArray[i] = array[i];
				else {
					if (array[i] > maxArray[i + 1])
						maxArray[i] = array[i];
					else
						maxArray[i] = maxArray[i + 1];
				}
			}
			
			printMin();
			pw.print("\n");
			printMax();
			pw.print("\n");
		}
		
		double end = System.nanoTime();
		pw.print("Total time taken: " + (end - start)/1000000000 + "s");
		pw.flush();
	}
	static String next() throws IOException {
		while (st == null || !st.hasMoreElements()) {
			st = new StringTokenizer(br.readLine());
		}
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	static void init() {
		minArray = new int[N];
		maxArray = new int[N];
		array = new int[N];
	}
	
	static void printMax() {
		for(int i=0; i<N; i++)
			pw.print(maxArray[i] + " ");
	}
	
	
	static void printMin() {
		for(int i=0; i<N; i++)
			pw.print(minArray[i] + " ");
	}
	
	static int solution() {
		int count = 0;
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				//if(array[i] < array[j])
					//if (!(array[i] < minArray[i]) &&)
					/** how to account for more than 2 elements, other than start and end index **/	
			}
		}
		return count;
	}
}
