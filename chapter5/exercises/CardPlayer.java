package chapter5.exercises;

import java.util.Scanner;

/**
 * A program to play card game.
 * @author LanXue
 */
public class CardPlayer {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the card notation: ");
        String notation = in.next();

        Card card1 = new Card(notation);
        System.out.println(card1.getDescription());
    }
}
