package aguideprog;

public class election {

	public static void main(String[] args) {
	
		double awbNy = 314159, awbNj = 89008, awbCon = 213451;
		double marNy = 271860, marNj = 121032, marCon = 231034;
				
		double totalVotes = awbNy + awbNj + awbCon + marNy + marNj + marCon;
			double totalAwb = awbNy + awbNj + awbCon;
			double totalMar = marNy+ marNj + marCon;
			
			double awbpercent = ( totalAwb / totalVotes) * 100;
			double marpercent = ( totalMar / totalVotes) * 100;

		  System.out.println("Candidates\t\tVotes\t\tPercentage");
		  System.out.println("Awbrey " +totalAwb +"\t\t\t\t" +awbpercent);
	        System.out.println("Martinez " +totalMar+"\t\t\t\t"+ marpercent);
	        System.out.println("Final Votes: "+ totalVotes);

	}

}
