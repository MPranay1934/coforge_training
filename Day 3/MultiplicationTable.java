import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int n = sc.nextInt();
		
		System.out.println("Multiplication Table : ");
		for(int i = 1; i <= 10; i++)
		{
			int mul = n * i;
			System.out.println(mul);
		}
	}

}
