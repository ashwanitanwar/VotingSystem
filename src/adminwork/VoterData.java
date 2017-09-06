package adminwork;

import java.util.Scanner;

public class VoterData {
	Scanner scan = new Scanner(System.in);
	String name;
	int Course;
	Integer ID;
	int Semester;
	String password;
	int flag=0;
	String str="MSC IT";
	VoterData(){
		
	}
	void getdata(){
		System.out.println("\nEnter the voter's detail\n");
		getID();
		getpass();
		getname();
		getcourse();
		if(flag!=0){
			return;
		}
		
		getsem();
		
	}
	void getID(){
		System.out.println("Enter your student ID: ");
		ID=scan.nextInt();
		scan.nextLine();
	}
	void getsem(){
		System.out.println("\nPlease mention the semester from (1-8)");
		Semester=scan.nextInt();
		scan.nextLine();
		if(Semester!=1){
			flag++;
			System.out.println("\nSorry!This election is for MSC IT 1st year students only");
		}
	}
	void getname(){
		System.out.println("\nEnter your Name: ");
		name=scan.nextLine();
	}
	void getcourse(){
		System.out.println("\nSelect the index of the course you are enrolled in : ");
		System.out.println("\n1.B.tech \n2.M.tech \n3.MSC IT \n4.B.tech ICT \n5.MSC IT-ARD \n6.PHD");
		Course=scan.nextInt();
		scan.nextLine();
		if(Course!=3){
			flag++;
			System.out.println("\nSorry!This election is for MSC IT 1st year students only");
		}
		
	}
	
	void getpass(){
		System.out.println("\nProvide a password(try not to forget it!)");
		password=scan.nextLine();
	}
	public String toString()
	{
		return name+"\t"+str+"\t"+Semester;
	}
}
