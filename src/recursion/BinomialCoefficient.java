package recursion;

/**
 * Created by abhishek.ar on 27/02/17.
 *
 * Following are common definition of Binomial Coefficients.
 1) A binomial coefficient C(n, k) can be defined as the coefficient of X^k in the expansion of (1 + X)^n.

 2) A binomial coefficient C(n, k) also gives the number of ways, disregarding order,
 that k objects can be chosen from among n objects; more formally, the number of k-element subsets
 (or k-combinations) of an n-element set.

 Write a function that takes two parameters n and k and returns the value of Binomial Coefficient C(n, k).
 For example, your function should return 6 for n = 4 and k = 2, and it should return 10 for n = 5 and k = 2.

 C(n, k) = C(n-1, k-1) + C(n-1, k)
 C(n, 0) = C(n, n) = 1
 */

public class BinomialCoefficient {
    public static int binomialCoeffient(int n, int k){
        if (k == 0 || k== n)
            return 1;
        else
            return binomialCoeffient(n-1, k-1) + binomialCoeffient(n-1, k);
    }

    public static void main(String[] args){
        System.out.println(binomialCoeffient(5,2));
    }
}
