package adminwork;

public class Voter {

//	private Integer studentID;
//	private String name;
	private Map<Integer,VoterData> voterList;//stores studentID and name in voter list
//below map stores studentID of voter and candidate chosen(actual voters,does not store info for students who didn't vote)
	private Map<Integer,Integer> votedFor;
	private Map<Integer,String> userPassword;
	
	private Map<Integer,VoterData> idAndDetails;
	
	private int numOfVoters;
	
	
	public Voter(int numOfVoters)
	{
		voterList=new Map(numOfVoters);
		votedFor=new Map(numOfVoters);
		userPassword=new Map(numOfVoters);
		idAndDetails=new Map(numOfVoters);
	}
	
	public void addVoter(Integer studentId,VoterData studentDetails)
	{
		voterList.put(studentId, studentDetails);		
	}
	
	public void viewVoter()
	{
		System.out.println("*********Voter List**********");
		voterList.viewKeyValue();
	}
	
	public void setnumOfVoters(int numOfVoters)
	{
		this.numOfVoters=numOfVoters;
	}
	public int getNumOfVoters()
	{
		return numOfVoters;
	}
	
	public int getNumOfFinalVoters()
	{
		return getVoterList().getSize();
	}
	
	
	public void voteCasted(Integer studentIDofVoter,Integer studentIDofCandidate)
	{
		votedFor.put(studentIDofVoter, studentIDofCandidate);
	}
	
	public void printVoteDetails()
	{
		for(int i=0;i<voterList.getSize();i++)
		{
			
			Integer voterID=(Integer)voterList.getEntries(i).getKey();
			Integer candidateChosen=votedFor.get(voterID);
			System.out.println(voterID+"--"+voterList.get(voterID)+" VOTED FOR "
			+ candidateChosen+"--"+ voterList.get(candidateChosen));
		}
		
	}
	
	public Map getVotedFor()
	{
		return votedFor;
	}
	public Map getVoterList()
	{
		return voterList;
	}
	
	public Map getUserPassword()
	{
		return userPassword;
	}
	
	public void setUserPassword(int user,String pass)
	{
		userPassword.put(user, pass);
	}
	
	public Map getIdAndDetails()
	{
		return idAndDetails;
	}
	
	public void setIdAndDetails(int userId,VoterData details)
	{
		idAndDetails.put(userId, details);
	}
//	public Map getVotedFor()
//	{
//		return votedFor;
//	}
	
}
