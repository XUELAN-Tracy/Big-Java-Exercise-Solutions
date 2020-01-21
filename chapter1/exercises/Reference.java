package chapter1.exercises;



public class Reference {

	public static void main(String[] args) {
		
        String greeting = "HELLo, World!";
        String greeting2 = greeting;
        greeting2.toLowerCase(); // this method create a new string and does not change the original string
        System.out.println("The greeting is: " + greeting);
        System.out.println("The greeting2 is: " + greeting2);
	}
	
}