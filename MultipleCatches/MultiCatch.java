package MultipleCatches;
import java.util.Scanner;

public class MultiCatch {
	public void catchProgram()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		try {
		double i=50/a;
		System.out.println("output is :"+i);
		System.out.println("no exceptio occure");
		}catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1);
		}catch(ArithmeticException e2) {
			System.out.println(e2);
		}
		catch(NullPointerException e3) {
			System.out.println(e3);
			
		}
		finally {
			System.out.println("program successfully executed");
		}
		
	}

}
