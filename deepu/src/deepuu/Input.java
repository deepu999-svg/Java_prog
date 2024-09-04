package deepuu;
import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		String name;
		int number;
		float percentage;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter your  number:");
		number=Integer.parseInt(s.nextLine());
		System.out.print("Enter your percentage:");
		percentage=Float.parseFloat(s.nextLine());
		System.out.print ("Enter your name:");
		name=s.nextLine();

		System.out.println("Name:"+name+"\nMobile number:"+number+"\nPercentage:"+percentage);
		s.close();
		
	}
}
