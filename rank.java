import java.util.*;  
class Ladder{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int a = sc.nextInt();
		if (a<100){
			System.out.println("You are topper");
		}
		else if (a<90){
			System.out.println("You are passed with first division");
		}
		else if (a<70){
			System.out.println("You are passed with second division");
		}
		else if (a<50){
			System.out.println("You are passed with third division");
		}
		else {
			System.out.println("you are failed");
		}
		System.out.println("Thanks for using harshit's rank checker tool");
	}
}