package adminwork;

public class Candidate {

//	private Integer studentID;
//	private String name;
	private Map<Integer,VoterData> candidateList;
	private int voteCount;
	private int numOfCandidates;
	
	public Candidate(int numOfCandidates)
	{
		candidateList=new Map(numOfCandidates);
		voteCount=0;
	}
	
	public void addCandidate(Integer studentID,VoterData details)
	{
		candidateList.put(studentID, details);		
	}
	
	public void viewCandidate()
	{
		System.out.println("*********Candidate List**********");
		candidateList.viewKeyValue();
	}
	
	public void setnumOfCandidates(int numOfCandidates)
	{
		this.numOfCandidates=numOfCandidates;
	}
	
	public int getNumOfCandidates()
	{
		return numOfCandidates;
	}
	
	public int getNumOfFinalCandidates()
	{
		return getCandidateList().getSize();
	}
	
	public Map getCandidateList()
	{
		return candidateList;
	}
	
}
