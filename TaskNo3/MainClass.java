package TaskNo3;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws UserDefinedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		if(age>17)
		{
			System.out.println("your eligible for vote");
		}
		else
		{
			throw new UserDefinedException("wait until cross the 17 for voting right");
		}
		
	}

}
