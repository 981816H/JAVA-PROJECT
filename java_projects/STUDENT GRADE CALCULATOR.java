package projects;
import java.util.*;
public class TASK2 {
	public static int getPercentage(int [] marks, int subjects) {
		
		int totalMarks=0;
		for(int val : marks) {
			totalMarks+=val;
		}
		 int averagePercentage=totalMarks /subjects;
		 
		 return averagePercentage;
		 
		
	}
	public static  String Grade_calculator(int []Obtained_marks,int subjects,String user) {
//		int one_subject_marks=100;
//		int sum=one_subject_marks*subjects;
//		 int Sum_Obtained_marks;
		Scanner s=new Scanner(System.in);
		 int average_percentage=getPercentage(Obtained_marks, subjects);
		 
//		 System.out.println("Average percentage of"+" "+user+" "+"is :- "+
//				 average_percentage+"%");
	
		 if (average_percentage >= 90 && average_percentage <= 100) {
			    //System.out.println(user + " gives A+ Grade.");
			    return "A+";
			} 
		 else if (average_percentage >= 80 && average_percentage <=90) {
			    //System.out.println(user + " gives A Grade.");
			 return "A";
			   
			} 
		 else if (average_percentage >= 70 && average_percentage <=80) {
			    //System.out.println(user + " gives B Grade.");
			     return "B";
			} 
		 else if (average_percentage >= 60 && average_percentage <=70) {
			    //System.out.println(user + " gives C Grade.");
			 return "C";
			} 
		 else if (average_percentage >= 50 && average_percentage <=60) {
			    //System.out.println(user + " gives D Grade.");
			 return "D";
			    
			} 
		 else if (average_percentage >= 40 && average_percentage <=50) {
			    // System.out.println(user + " gives E Grade.");
			 return "E";
			} 
		 else {
			    //System.out.println(user + " is fail.");
			    return "F";
			}	 
		
		 
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s =new Scanner(System.in);
//        while(true) {       
        System.out.print("Enter the user's name: ");
        
        String user=s.next();
        
        System.out.print("Enter the number of subjects: ");
        
        int subjects=s.nextInt();
        int []Obtained_marks=new int[subjects];
        int total_sum_marks=0;
        
        for(int i=0;i<subjects ;i++) {
        	 System.out.print("Enter marks obtained in subject " + 
        (i + 1) + ": ");
        	 
        	Obtained_marks[i]=s.nextInt();
        	
        }
        	
          int averagePercentage= getPercentage(Obtained_marks, subjects);
          String Grade=	Grade_calculator(Obtained_marks,subjects,user);

          System.out.println(user + " "+ averagePercentage+ " "+ Grade);
        }
        	
        	
	}


