package primalityTesters;

import java.util.ArrayList;

public class PrimeLister {

//	sieve of eratosthenese
	public static Integer[] getListOfPrimesLessThan(int limit) {
		boolean[] isPrime = new boolean[limit];
		for (int i = 0; i < limit; i++) {
			isPrime[i] = true;
		}

		for (int i = 2; i < limit; i++) {
			if (isPrime[i]) {
				int m = 2;
				int p = i * m;
				while (p < limit) {
					if (isPrime[p])
						isPrime[p] = false;
					m++;
					p = i * m;
				}
			}
		}
		ArrayList<Integer> primeList = new ArrayList<>();
		for (int i = 2; i < limit; i++) {
			if (isPrime[i])
				primeList.add(i);
		}
		return primeList.toArray(new Integer[primeList.size()]);
	}

}
