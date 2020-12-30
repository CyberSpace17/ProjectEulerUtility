package test;

import primalityTesters.PrimeLister;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] primeList;
		for(int i = 1; i < 10; i++) {
			int limit = (int) Math.pow(10, i);
			long start = System.currentTimeMillis();
			primeList = PrimeLister.getListOfPrimesLessThan(limit);
			System.out.println("limit: "+ limit+" count: "+primeList.length+" time: "+(System.currentTimeMillis()-start));
		}
	}
}
