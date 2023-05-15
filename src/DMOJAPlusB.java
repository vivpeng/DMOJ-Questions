/*
Vivian Peng
02/10/2022
A Plus B
 */

import java.util.Scanner;

public class DMOJAPlusB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfProblems = scanner.nextInt();

        for (int i = 1; i <= numOfProblems; i++) {
            int answer = scanner.nextInt();
            answer += scanner.nextInt();
            System.out.println(answer);
        }
    }
}
