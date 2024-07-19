package projects;
import java.util.*;
import java.util.Random;
public class TASK_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner s =new Scanner(System.in);
	 
	 Random number=new Random();
	
	int target=number.nextInt(100)+1;
	 boolean correct_answer=false;
	 boolean play_again=true;
	 int low=0;
	 int high=100;
	 int Score=10;
	 int max_attempts=10;
	 int attempts=0;
	
	 while(attempts<max_attempts &&!correct_answer) {

		 System.out.print("Guessing the number by the user between"+" "+low+" "+"to"+" "+high+":");
		 int guess=s.nextInt();
		 attempts++;
		 
		 if(guess==target) {
			 System.out.println("congraluation you got the number"+" "+guess+".");
			 //Score += (max_attempts - attempts + 1);
			 //Score++;
			 correct_answer=true; // question
	 }
		 else if(guess<target){
			 System.out.println("Too low! Try Again.");
			 low=guess+1;
			 Score--;
			 
		 }
		 else {
			 System.out.println("Too high! try again.");
			 high=guess-1;
			 Score--;
		 }
	 }
	 System.out.println("Thank you for playing! Your final score is: " + Score);
	 if(!correct_answer) {
		 System.out.println("Sorry you have use all attempts."+" "+"The correct number is:"+target);
		 System.out.print("Do you want to play another round? (yes/no): ");
		 String response = s.next();  //question
	    // play_again = response.equalsIgnoreCase("yes");

	 }
	
	 	}

}
