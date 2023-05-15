/*
Vivian Peng
13/10/2022
CCC '07 J3 - Deal or No Deal Calculator
Canadian Computing Competition: 2007 Stage 1, Junior #3
 */

import java.util.Scanner;

public class DMOJDealOrNoDeal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] money = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
        int sumEliminated = 0;
        int sumTotal = 0;

        for(int i = 0; i<money.length; i++)
            sumTotal += money[i];

        int numCasesOpened = scanner.nextInt();

        for (int i = 0; i < numCasesOpened; i++){
            int caseOpened = scanner.nextInt();
            sumEliminated += money[caseOpened-1];
        }

        int bankersOffer = scanner.nextInt();

        if( bankersOffer > (sumTotal - sumEliminated) / (10 - numCasesOpened))
            System.out.print("deal");
        else
            System.out.print("no deal");
    }
}
