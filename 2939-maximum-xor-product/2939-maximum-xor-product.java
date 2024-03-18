import java.util.*;

class Solution {

    // A ^ X = C
    // B ^ X = D
    // res = C * D

    // 0 ^ 1 = 1 ^ 0 = 1
    // choose X so it has max diff bits from A and B

//    THEOREM: to maximize C * D: make them as close as possible!!!!
//    so if not possible to add 1 to both C and D,
//    we set ith bit of min number and unset bit of max number

    // KEY TRICK!!!!! YOU CAN'T BUILD C,D SEPARATELY AND IGNORE THE LEADING BITS OF A,B
    // MUST REUSE A,B as A^X and B^X and ALWAYS KEEP TRACK OF THE SMALLER SO YOU BOOST IT!!!!

    // ALSO START FROM MOST IMPORTANT BIT!!!!!!
    public int maximumXorProduct(long a, long b, int n) {
        long M = (long) Math.pow(10, 9) + 7;
        for (int i = n - 1; i >= 0; i--) { // limit mask < 2^N
            long mask = 1L << i;
            if ((a & mask) == (b & mask)) { // bit same bit in A,B => put opposite in X, add 1 in C,D
                a |= mask;
                b |= mask;
            } else if (a < b) { // c < d; boost smaller, sacrifice bit in larger
                a |= mask;
                b &= ~(mask);
            } else { // c > d; boost smaller, sacrifice bit in larger
                b |= mask;
                a &= ~(mask);
            }
        }

        return (int) (((a % M) * (b % M)) % M);
    }


}
