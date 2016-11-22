package Task7;

public class Sieve {
	public static void main(String[] args){
		// Upper sieve limit
		int n = 3000000;
		
		// Array to determine primality
		boolean[] primes = new boolean[n+1];
		
		// Assume all numbers >= 2 are prime
		for (int i = 2; i <= n; i++){
			primes[i] = true;
		}
		
		// Check primality from 2 to sqrt(n)
		for (int i = 2; i * i < n; i++){
			if (primes[i] == true){
				// if true set all multiples to false
				for (int j = i; j * i <= n; j++){
					primes[i*j] = false;
				}
			}
		}
		
		// count primes
		int numPrimes = 0;
		for (int i = 2; i <= n; i++){
			if (primes[i]) numPrimes++;
		}
		System.out.print("Primes between 0 and " + n + ":\t" + numPrimes);
	}
}
