package chapter4.exercises;

/**
 * A class to test class StampMachine412.
 * @author LanXue
 */
public class StampMachine412Tester {

    public static void main(String[] args) {

        StampMachine412 machine = new StampMachine412();
        machine.insertDollars(1);
        System.out.println("First class stamps: " + machine.giveFirstClassStamps());
        System.out.println("The expected: 2");
        System.out.println("Penny Stamps: " + machine.givePennyStamps());
        System.out.println("The expected: 12");
    }

}
