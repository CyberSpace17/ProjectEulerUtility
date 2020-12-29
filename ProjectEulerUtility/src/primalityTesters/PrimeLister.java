package primalityTesters;

import java.util.ArrayList;

public class PrimeLister {

//	sieve of eratosthenese
	public static Integer[] getListOfPrimesLessThan(int limit) {
		int size = limit;
		boolean[] isPrime = new boolean[size];
		for (int i = 0; i < size; i++) {
			isPrime[i] = true;
		}

		for (int i = 2; i < size; i++) {
			if (isPrime[i]) {
				int m = 2;
				int p = i * m;
				while (p < size) {
					if (isPrime[p])
						isPrime[p] = false;
					m++;
					p = i * m;
				}
			}
		}
		ArrayList<Integer> primeList = new ArrayList<>();
		for (int i = 2; i < size; i++) {
			if (isPrime[i])
				primeList.add(i);
		}
		return primeList.toArray(new Integer[primeList.size()]);
	}

}
