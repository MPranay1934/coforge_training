import java.util.Scanner;

public class Largestinthree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b && a > c) { 
			System.out.println(a + " is the greatest");
		}
		else if(c > b && c > a) {
			System.out.println(c + " is the greatest");
		}
		else {
			System.out.println(b + " is the greatest");
		}
	}

}
