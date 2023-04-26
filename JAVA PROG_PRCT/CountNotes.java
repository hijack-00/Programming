import java.util.Scanner;

public class CountNotes {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int amount;

        int totalNotes, notes_2000, notes_500, notes_200, notes_100, notes_50, notes_20, notes_10, notes_5;

        System.out.println("Pls enter amount: ");
        amount = obj.nextInt();
        System.out.println("You entered amount: " + amount);

        int OrgAmount = amount;

        notes_2000 = amount / 2000;
        amount %= 2000;

        notes_500 = amount / 500;
        amount %= 500;

        notes_200 = amount / 500;
        amount %= 200;

        notes_100 = amount / 100;
        amount %= 100;

        notes_50 = amount / 50;
        amount %= 50;

        notes_20 = amount / 20;
        amount %= 20;

        notes_10 = amount / 10;
        amount %= 10;

        notes_5 = amount / 5;

        totalNotes = notes_2000 + notes_500 + notes_200 + notes_100 + notes_50 + notes_20
                + notes_10 + notes_5;

        System.out.println("Total number of notes in " + OrgAmount + ": " + totalNotes);
        System.out.println("Total number of notes in 2000: " + notes_2000);
        System.out.println("Total number of notes in 500: " + notes_500);
        System.out.println("Total number of notes in 200: " + notes_200);
        System.out.println("Total number of notes in 100: " + notes_100);
        System.out.println("Total number of notes in 50: " + notes_50);
        System.out.println("Total number of notes in 20: " + notes_20);
        System.out.println("Total number of notes in 10: " + notes_10);
        System.out.println("Total number of notes in 5: " + notes_5);

    }
}
