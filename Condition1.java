import java.util.*;
public class Condition1{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		switch(button){
			case 1:System.out.println("Abhishek");
			break;
			case 2:System.out.println("Kumar");
			break;
			case 3:System.out.println("Sahni");
			default:System.out.println("Invalid Button");
		}
	}
}
