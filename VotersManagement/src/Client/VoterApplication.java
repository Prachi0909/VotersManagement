package Client;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import MyException.InvalidAgeException;
import MyException.ServiceException;
import VotersSystem.Entities;

public class VoterApplication {
	
	static Scanner sc = new Scanner(System.in);
	static List<Entities> voterList = new ArrayList<Entities>(); 
	public static void main(String[] args) {
		VoterApplication vc = new VoterApplication();
		try {
			vc.createVoter(voterList);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}     //method call
		
		Iterator i = voterList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	public void createVoter(List<Entities> voterList) throws ServiceException {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of voters you want to insert: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
		System.out.println("Enter the id of the voter: ");
		long id = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the name of the voter: ");
		String name = sc.nextLine();
		System.out.println("Enter the age of the voter: ");
		int age = sc.nextInt();
		
		Entities voter1 = new Entities(id,name,age);
		voterList.add(voter1);
		int givenAge = voter1.getAge();
		try {
			if(givenAge<18) {
				throw new InvalidAgeException("age is less than 18");
				//this is the actual exception 
			}
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//wrapping it to service exception
			throw new ServiceException("Age Validation",e);
		}
		//System.out.println(voter1);
		}
	}
}
