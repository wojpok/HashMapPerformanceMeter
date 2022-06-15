package src;

public class HashFunctions { }

/*
Interface describing hashing functions used in this projects
Note that each HashingFunction has to be configured with respect to its concrete implementation
*/

interface HashingFunction {
    void SetSize(int TableSize);
    int GetHash(int key);
}

/*
Interface describing second level of hashing
It is necessary since we are dealing with open adressing

Juest like HashFuntions, IterableHashing object needs to be configured with accordance to its implementation
*/

interface IterableHashing {
    void SetSize(int TableSize);
    void GetHash(int key, int iteration);
}

/*
Global class with useful utilities

RoundUpToPrime lookups prime larger then given value, useful in all sorts of hashing and cryptographic functionalities.
*/

class HashingUtil {

    // Naive approach, stores static array of primes smaller then 102
    public static int RoundUpToPrime(int value) {
        final int primes[] = {
            2, 3, 5, 7,	11,	13,	17,	19,	23,	29,	31,	37,	41,	43,	47,	53, 59,	61,	67,	71, 73,	79,	83,	89,	97,	101
        };

        // greedy lookup is fine, by definition the upper limit for primes is O( n / log(n) ) 

        if(value > 100 || value <= 0)
            return 0;

        
        for(int i = 0; ;i++) {
            if(value < primes[i])
                return primes[i];
        }
    }
}














