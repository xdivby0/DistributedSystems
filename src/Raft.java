
public class Raft {

	private String role;
	int term;
	String currentLeader;
	String clientList[][];
	Date lastVote;
	boolean didVote=false;
	
	private void startRaft() {
		while(true) {
			try{
				Thread.sleep()
			}catch(Exception e)
		}
		
	}
	private int votingCycle() {
		int random = ThreadLocalRandom.current().nextInt(10, 150);
		return 150 + random;
	}
	
	private void becomeCanidate() {
		
	}
	public void voteLeader() {
		boolean didVote=true;
	}
	public setLeader() {
		didVote=false;
		term = term+1;
	}
	
	
}
