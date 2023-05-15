/*
Vivian Peng
03/10/2022
CCC '04 J2 - Terms of Office
Canadian Computing Competition: 2004 Stage 1, Junior #2
 */

import java.util.Scanner;

public class DMOJTermsOfOffice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int yearX = scanner.nextInt();
        int yearY = scanner.nextInt();

        for(int i = yearX; i <= yearY; i+=5) {
            if ((i-yearX) % 4 == 0 && (i-yearX) % 3 == 0) {
                System.out.println("All positions change in year " + i);
            }
        }
    }
}
