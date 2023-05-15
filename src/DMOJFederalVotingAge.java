package src;/*
Vivian Peng
02/10/2022
CCC '07 S1 - Federal Voting Age
Canadian Computing Competition: 2007 Stage 1, Senior #1
 */
import java.util.Scanner;

public class DMOJFederalVotingAge {
    public static void main(String[] args){
        int numOfBdays, year, month, day, age = 0;
        String answers = "";

        Scanner scanner = new Scanner(System.in);

        numOfBdays = scanner.nextInt();

        for(int i = 1; i <= numOfBdays; i++){
            year = scanner.nextInt();
            month = scanner.nextInt();
            day = scanner.nextInt();

            age = 2007-year;

            if (month == 1 || month == 2 && day <= 27)
                age ++;

            if (age >= 18)
                answers += "Yes \n";
            else
                answers += "No \n";
        }
        System.out.print(answers);
    }
}
