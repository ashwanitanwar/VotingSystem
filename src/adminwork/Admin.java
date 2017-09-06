package adminwork;

public class Admin {

	
	Candidate candidate;
	Voter voter;
	private Map<Integer,Integer> votedCount;//stores studentID of candidate and total number of votes
	Integer max;
	Integer winnerID;
	VoterData cName;
	//Integer winnerID2;
	//String cName2;
	
	public Admin()
	{
		this.candidate=null;
		this.voter=null;
		this.max=0;
		this.winnerID=0;
		this.cName=null;
		//this.winnerID2=0;
		//this.cName2=null;
		
	}
	
//	public Admin(Voter voterFake,int totalNumOfVoters)//A fake voter object to differentiate 2 constructors
//	{
//		this.voter=new Voter(totalNumOfVoters);
//	}
//	
//	public Admin(Candidate candidate,int totalNumOfCandidates)////A fake candidate object to differentiate 2 constructors
//	{
//		this.candidate=new Candidate(totalNumOfCandidates);
//	}
//	
	public Candidate getCandidate()
	{
		return candidate;
	}
	
	public Voter getVoter()
	{
		return voter;
	}
	
	//creating a Voter object
	public void setVoter(int totalNumOfVoters)
	{
		this.voter=new Voter(totalNumOfVoters);
	}
	
	//creating a Candidate object 
	public void setCandidate(int totalNumOfCandidates)
	{
		this.candidate=new Candidate(totalNumOfCandidates);
		votedCount=new Map(totalNumOfCandidates);
	}
	
	
	public void countVote()
	{
		
		for(int i=0;i<candidate.getCandidateList().getSize();i++)
		{
			Integer counter=0;
			
			
			for(int j=0;j<voter.getVotedFor().getSize();j++)
			{
				// comparing key of votedFor map and candidateList map. Below code is checking 
				//for a fixed i(one particular candidate) and all the vote (casted vote) of athe voters. If they have chosen 
				//that particular i, then max=counter number of votes till now of any candidate.
				if(voter.getVotedFor().get(voter.getVotedFor().getEntries(j).getKey()).
						equals(candidate.getCandidateList().getEntries(i).getKey()))
				{	
					counter++;
				}
			
			}
			if(max<counter)
				{ max=counter;
				winnerID=(Integer)candidate.getCandidateList().getEntries(i).getKey();
				cName=(VoterData)candidate.getCandidateList().getEntries(i).getValue();
				}
			/*else if(max==counter)
			{
				winnerID2=(Integer)candidate.getCandidateList().getEntries(i).getKey();
				cName2=(String)candidate.getCandidateList().getEntries(i).getValue();
			}*/
			votedCount.put((Integer)candidate.getCandidateList().getEntries(i).getKey(), counter);
			
		}
		
		System.out.println("The number of votes secured by each candidate");
		for(int i=0;i<candidate.getCandidateList().getSize();i++)
		{
			System.out.println(votedCount.getEntries(i).getKey()+"--"+
		candidate.getCandidateList().get(votedCount.getEntries(i).getKey())+"--->"+votedCount.getEntries(i).getValue());
		}
		
		System.out.println("Winner is "+winnerID+"--"+cName+" won with "+max+ " votes ");
		
	}
	
	public void printWinner()
	{
		System.out.println("Winner is "+winnerID+"--"+cName+" won with "+max+ " votes ");
	}
	
	
	 
}
