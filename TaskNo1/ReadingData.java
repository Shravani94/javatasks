package TaskNo1;
import java.util.Scanner;

public class ReadingData {
	public static void main(String [] args)throws CustomException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id to search");
		int Id=sc.nextInt();
		Organization o1=new Organization("nibba",123,"hyderbad");
		Organization o2=new Organization("nibbi",124,"kukatpally");
		Organization o3=new Organization("dinga",125,"gacchibowli");
		Organization o4=new Organization("dingi",126,"gacchibowli");
		if(Id==o1.Id||Id==o2.Id||Id==o3.Id||Id==o4.Id)
		{
			System.out.println("Welcome to office");
		}
		else
		{
			throw new CustomException("given Employe e ID is not found or mismatched,please enter the valid ID" );
			
				}
		
		
	}

}
