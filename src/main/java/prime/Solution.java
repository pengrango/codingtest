package prime;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger bigInteger = new BigInteger(n);
        boolean probablePrime = bigInteger.isProbablePrime(Integer.MAX_VALUE);
        if (probablePrime == true) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        scanner.close();
    }


}