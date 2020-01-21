package chapter3.exercises;

public class VotingMachineDemo {

	public static void main(String[] args) {
		VotingMachine votingMachine = new VotingMachine();

        votingMachine.voteDemocrat();
        votingMachine.voteDemocrat();
        votingMachine.voteDemocrat();

        votingMachine.voteRepublican();
        votingMachine.voteRepublican();
        
        String result = votingMachine.getResult();
        System.out.println(result);
        
        // Resets the machine
        votingMachine.reset();
        System.out.println("*** Reset votes ***");
        
        result = votingMachine.getResult();
        System.out.println(result);

	}

}
