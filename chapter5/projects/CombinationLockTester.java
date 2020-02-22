package chapter5.projects;

import java.util.Scanner;

/**
 * A class to test CombinationLock class.
 * @author LanXue
 * @date 2020-02-13 22:34
 */
public class CombinationLockTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        CombinationLock lock = new CombinationLock("TCC");
        System.out.println("Please dial (enter \"done\" when you finish): ");
        String input;
        while (!(input = in.nextLine()).equals("done")) {
            lock.setDial(input);
        }
        lock.unlock();
        if (lock.isOpen()) {
            System.out.println("The lock has been opened!");
        } else {
            lock.close();
            while (! lock.isOpen()) {
                System.out.println("The lock has been closed. Please try again.");
                System.out.println("Please dial (enter \"done\" when you finish): ");
                input = in.next();
                while (! input.equals("done")) {
                    lock.setDial(input);
                    input = in.next();
                }
                lock.unlock();
                if (lock.isOpen()) {
                    System.out.println("The lock has been opened!");
                    break;
                }
            }
        }
    }
}
