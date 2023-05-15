/*
Vivian Peng
14/10/2022
The Cosmic Era P1 - Ship
 */

import java.util.Scanner;

public class DMOJCosmicEra {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String partsNeeded = "BFTLC";
        String partsMissing = "";
        String parts = scanner.nextLine();

        for(int i =0; i< partsNeeded.length(); i++){
            if(parts.indexOf(partsNeeded.charAt(i)) == -1)
                partsMissing += partsNeeded.charAt(i) + "\n";
        }

        if (partsMissing == "")
            System.out.println("NO MISSING PARTS");
        else
            System.out.print(partsMissing);
    }
}
