package adminwork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
	//static boolean tester=false;
	public static void main(String[] args) 
			//throws FileNotFoundException
	{
	//	File file=new File("src/abc");
		int category;
		Admin admin=new Admin();
	//	Scanner scanner1=new Scanner(file);
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("");
		System.out.println("");
		do
		{
			try{
				
			System.out.println("*******WELCOME TO SPC ELECTION*********");
			System.out.println("\nPlease choose your category");
			System.out.println("");
			System.out.println("1. Admin\n2. Voter\n3. General Public");
			System.out.println("");
			System.out.println("Enter the desired number");
			//if( tester ){
				category=scanner.nextInt();
				scanner.nextLine();
			//	System.out.println("CATEGORY "+category);
		//	}
//			else{
//				
//			}
			boolean again=true;
			
			if(category==1)
			{
				System.out.println("*********Welcome to Admin Section***********");
				System.out.println("\nEnter User ID");
				//scanner.nextLine();
				String userid=scanner.nextLine();
				System.out.println("\nEnter Password");
				String pass=scanner.nextLine();
				
				if(userid.equals("admin")&&pass.equals("admin"))
				{ 
					System.out.println("\nUser ID and Password Accepted\n");
					boolean check1=false;
				do{
					
					
					
						
						System.out.println("1. Enter total number of Voters\n2. Add Voter to the list"
								+ "\n3. Enter total number of Candidates\n4. Add Candidate to the list"
								+ "\n5. Count votes");
						System.out.println("\nChoose desired option by entering digit");
						int option=scanner.nextInt();
						scanner.nextLine();
						
						if(option==1)
						{
							System.out.println("Enter total number of voters ");
							int totalNumOfVoters=scanner.nextInt();
							//Voter voterFake;
							scanner.nextLine();
							admin.setVoter(totalNumOfVoters);//creating Voter object via admin
							admin.getVoter().setnumOfVoters(totalNumOfVoters);
							System.out.println("Total number of voters:"+totalNumOfVoters);
						}
						else if(option==2)
						{
							System.out.println("\nNo.\tID\tName\tCourse\tSemester");
							admin.getVoter().getIdAndDetails().viewKeyValue();
							/*System.out.println("Please enter DA-IICT Student ID ");
							Integer studentID=scanner.nextInt();
							scanner.nextLine();
							System.out.println("Please enter the name of voter");
							String name=scanner.nextLine();*/
//							if(admin.getVoter().getVoterList().getSize()<=admin.getVoter().getNumOfVoters())
//							{
//								//admin.getVoter().addVoter(studentID,name);	
//							}
							boolean check=false;
							
							do{ System.out.println("\nPlease choose S.No of the desired voter");
								int serial=scanner.nextInt();
								scanner.nextLine();
								Integer tempId=(int)admin.getVoter().getUserPassword().getKeyFromi(serial-1);
								admin.getVoter().addVoter(tempId,(VoterData)admin.getVoter().getIdAndDetails().get(tempId));
								System.out.println("\nVoter has been added to Voter List.");
								System.out.println("\nDo you want to add more voters?\n1. Type 'Yes' for Yes\n2. Type 'No' for No ");
							//	scanner.nextLine();
								String condition=scanner.nextLine();
								if(condition.equals("Yes"))
									check=true;
								else if(condition.equals("No"))
									check=false;
								else System.out.println("\nInvalid entry,exiting.....");
							}while(check);
							
							
						}
						else if(option==3)
						{
							System.out.println("\nEnter total number of candidates ");
							int totalNumOfCandidate=scanner.nextInt();
							scanner.nextLine();
							admin.setCandidate(totalNumOfCandidate);//creating Candidate object via admin
							admin.getCandidate().setnumOfCandidates(totalNumOfCandidate);
							System.out.println("\nTotal number of candidates:"+totalNumOfCandidate);
						}
						else if(option==4)
						{
							/*System.out.println("Please enter DA-IICT Student ID ");
							Integer studentID=scanner.nextInt();
							System.out.println("Please enter the name of candidate");
							scanner.nextLine();
							String name=scanner.nextLine(); 
							if(admin.getCandidate().getCandidateList().getSize()<=admin.getCandidate().getNumOfCandidates())
							{
								admin.getCandidate().addCandidate(studentID,name);
							}
							else
							{
								System.out.println("Sorry, the number of candidates exceeded.");
							}*/
							
							System.out.println("\nNo.\tID\tName\tCourse\tSemester");
							admin.getVoter().getIdAndDetails().viewKeyValue();
							/*System.out.println("Please enter DA-IICT Student ID ");
							Integer studentID=scanner.nextInt();
							scanner.nextLine();
							System.out.println("Please enter the name of voter");
							String name=scanner.nextLine();*/
//							if(admin.getVoter().getVoterList().getSize()<=admin.getVoter().getNumOfVoters())
//							{
//								//admin.getVoter().addVoter(studentID,name);	
//							}
							boolean check=false;
							
							do{ System.out.println("\nPlease choose S.No from below for the candidate list");
								int serial=scanner.nextInt();
								scanner.nextLine();
								Integer tempId=(int)admin.getVoter().getUserPassword().getKeyFromi(serial-1);
								admin.getCandidate().addCandidate(tempId,(VoterData)admin.getVoter().getIdAndDetails().get(tempId));
								System.out.println("\nCandidate has been added to Candidate List.");
								System.out.println("\nDo you want to add more candidates?\n1. Type 'Yes' for Yes\n2. Type 'No' for No ");
								//scanner.nextLine();
								String condition=scanner.nextLine();
								if(condition.equals("Yes"))
									check=true;
								else if(condition.equals("No"))
									check=false;
								else System.out.println("\nInvalid entry,exiting.....");
							}while(check);
							
							
						}
						
						/*else if(option==5)
						{
							
							admin.getVoter().printVoteDetails();
						}*/
						else if(option==5)
						{
							admin.countVote();
						}	
						else System.out.println("This option is not valid.");
						System.out.println("\n\nDo you want to exit?\n1. Type 'Yes' for Yes\n2. Type 'No' for No ");
						//scanner.nextLine();
						String condition=scanner.nextLine();
						if(condition.equals("Yes"))
							check1=false;
						else if(condition.equals("No"))
							check1=true;
						else System.out.println("\nInvalid entry,exiting.....");
					
				}
					while(check1);
				}
				else{
					System.out.println("Incorrect UserID/Password. ");
				}
				
			}
			else if(category==2)
			{
				System.out.println("*********Welcome to Voter Section**********");
				System.out.println("\n1. Cast vote\n2. Register yourself");
				System.out.println("Choose desired option by entering digit");
				int option=scanner.nextInt();
				scanner.nextLine();
				boolean check4=false;
				do
				{
					if(option==1)
					{
						System.out.println("*********Welcome to Online Voting. Please enter your"
								+ " DA-IICT ID and password**********");
						System.out.println("\n\nEnter your DA-IICT Student ID");
						int studentID=scanner.nextInt();
						System.out.println("Enter your Password");
						scanner.nextLine();
						String password=scanner.nextLine();
						
						String original=(String)admin.getVoter().getUserPassword().get(studentID);
						if(password.equals(original))
						{
							System.out.println("*********Welcome*********\n ");
							System.out.println(studentID+" "+admin.getVoter().getVoterList().get(studentID));
							System.out.println(" \nPlease"
									+ " choose candidates from below List*******");
							admin.getCandidate().viewCandidate();
							if(!admin.getVoter().getVotedFor().contains(studentID))
							{
							System.out.println("\nEnter S.No of your chosen candidate");
							/*int studentIDofCandi=scanner.nextInt();
							*/
							
							int serial=scanner.nextInt();
							scanner.nextLine();
							Integer studentIDofCandi=(int)admin.getCandidate().getCandidateList().getKeyFromi(serial-1);
							admin.getVoter().voteCasted(studentID,studentIDofCandi);
							
							
							System.out.println("\nThanks for voting");
							}
							else
							{
								System.out.println("\nOops! No spams Please. "
										+ "You have already done voting!");
							}
						}
						else
						{
							System.out.println("\nIncorrect UserID/Password. ");
						}
					}
					else if(option==2)
					{
						System.out.println("*********Welcome to Registration Page***********");
						VoterData voterr=new VoterData();
						voterr.getdata();
						if(admin.getVoter().getUserPassword().getSize()<admin.getVoter().getNumOfVoters())
						{
							if(voterr.flag==0){
							admin.getVoter().setUserPassword(voterr.ID, voterr.password);
							admin.getVoter().setIdAndDetails(voterr.ID,voterr );
							
							System.out.println("\nVoter Registered successfully with \nUser Id: "+voterr.ID+"\nPassword: "+voterr.password);	
						}
							}
						else
						{
							System.out.println("\nSorry, the number of voters exceeded.");
						}
						
					}
					
					
					else
					{
						System.out.println("\nInvalid category.  Please chose correct one.");
					}
					
					System.out.println("\nDo you want to exit?\n1. Type 'Yes' for Yes\n2. Type 'No' for No ");
					//scanner.nextLine();
					String condition=scanner.nextLine();
					if(condition.equals("Yes"))
						check4=false;
					else if(condition.equals("No"))
						check4=true;
					else System.out.println("\nInvalid entry,exiting.....");	
				}
				while(check4);
			}
//			else if(category==3)
//			{
//				System.out.println("Welcome to Candidate Section");
//			}
			else if(category==3)
			{
						boolean check6=false;
				do
				{
					System.out.println("*********Welcome to General Public Section***********");
					System.out.println("\n1. View total number of Voters\n2. View Voter list"
							+ "\n3. View total number of Candidates\n4. View Candidate list\n5. View result");
					System.out.println("Choose desired option by entering digit");
					int option=scanner.nextInt();
					scanner.nextLine();
					
					if(option==1)
					{
						System.out.println("Total Number of Voters are: "+ admin.getVoter().getNumOfFinalVoters());
						
					}
					else if(option==2)
					{
						admin.getVoter().viewVoter();
					}
					else if(option==3)
					{
						System.out.println("Total Number of Candidates are: "+ admin.getCandidate().getNumOfFinalCandidates());
					}
					else if(option==4)
					{
						admin.getCandidate().viewCandidate();
					}
					else if(option==5)
					{
						admin.printWinner();
					}
					else
					{
						System.out.println("Invalid category.  Please chose correct one.");
					}
					
					System.out.println("\nDo you want to exit?\n1. Type 'Yes' for Yes\n2. Type 'No' for No ");
					//scanner.nextLine();
					String condition=scanner.nextLine();
					if(condition.equals("Yes"))
						check6=false;
					else if(condition.equals("No"))
						check6=true;
					else System.out.println("\nInvalid entry,exiting.....");	
				}
				while(check6);
			}
			else
			{
				System.out.println("\nInvalid category. Please chose correct one.");
			}
			
}
		
		catch(Exception e){
			System.out.println("\nInvalid Entry.");
			scanner.nextLine();
		} 
		
		 
		
		
		}while(true);
		
	}
}
