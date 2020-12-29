package primalityTesters;

import java.math.BigInteger;

public class PrimalityTester {
	
	public static boolean isPrime(int n) {
        if (n <= 1) 
            return false; 
        if (n <= 3) 
            return true; 

        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
  
        int lim = (int)Math.sqrt(n);
        for (int i = 5; i <= lim; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
  
        return true; 
	}
	
	public static boolean isPrime(long n) {
        if (n <= 1) 
            return false; 
        if (n <= 3) 
            return true; 

        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
  
        long lim = (long) Math.sqrt(n);
        for (long i = 5; i <= lim; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
  
        return true; 
	}
	
	public static boolean isPrime(BigInteger n) {
		if(n.compareTo(BigInteger.ZERO) <= 0)
			return false;
		return n.isProbablePrime(Integer.MAX_VALUE);
	}

}
