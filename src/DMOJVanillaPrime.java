/*
Vivian Peng
26/09/2022
DWITE '07 R1 #1 - Vanilla Primes
In mathematics, a prime number is a natural number which has exactly two distinct natural number divisors: 1 and itself.
For example: 2, 3, 5, 7, 11, 13, 17, 19 are the first eight prime numbers.
A vanilla flavour programming problem is to figure out if a given number is a prime or not.
The input will contain a single integer -1000 <= N <= 1000.
The output will contain a single line, stating if the supplied integer is prime or not.
 */

import java.util.Scanner;

public class DMOJVanillaPrime {
    public static void main (String[] args){
        int givenInt;
        boolean isPrime = true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a single integer up to 1000: ");
        givenInt = scanner.nextInt();

        scanner.close();

        if(givenInt == 2)
            System.out.print("prime");

        else if(givenInt%2 == 0) //if num is even we don't need to go thru the whole loop cuz we know it's not prime
            isPrime = false;
        else
            for(int i=2; i < Math.sqrt(givenInt); i++){ //can be made more efficient for program by only making i go up to the sqrt of givenInt
                if (givenInt % i == 0)
                    isPrime = false;
            }

        if (isPrime)
            System.out.print("prime");
        else
            System.out.print("not");
    }
}