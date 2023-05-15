/*
Vivian Peng
17/10/2022
New Year's '18 P2 - Mimi and Christmas Cake
 */

import java.util.Scanner;
public class DMOJMimiChristmasCakeX {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numOfSlices = scanner.nextInt();
        boolean[] primePieces = new boolean [100001];
        int numOfPieces;

        for(int i = 0; i < numOfSlices; i++) {
            numOfPieces = scanner.nextInt();
            primePieces[numOfPieces] = true; //only those that we entered as num of slices is prime temporarily
        }

        for(int i = 2; i*i < primePieces.length; i++){
            if(primePieces[i])
                for(int j = i*i; j <= primePieces.length; j+=i)
                    primePieces[j] = false;
        }

        int counter = 0;
        for(int i = 0; i < numOfSlices; i++){
            if (primePieces[i])
                counter ++;
        }

        System.out.println(counter);
    }
}