package projects;
import java.util.*;
class ATM{
	float balance;
	int pin=5674;
	
//	public ATM(int i) {
//		// TODO Auto-generated constructor stub
//		this.pin=pin;
////		this.balance=balance;
//		checkPin(pin);
//	}
	public void checkPin() {
//		this.pin=pin;
//		this.balance=balance;
		System.out.println("Enter your pin:");
		Scanner s=new Scanner(System.in);
		int enterPin=s.nextInt();
		if(enterPin==pin) {
			menu();
			
		}else {
			System.out.println("Enter a valid pin");
			checkPin();
		}
		
	}
	//after pin atm show menu
	public void menu() {
		System.out.println("Enter your choice:");
		System.out.println("1.Check A/c Balance:");
		System.out.println("2.Withdraw Money:");
		System.out.println("3.Deposite Money:");
		System.out.println("4.EXIT");
		Scanner s=new Scanner(System.in);
		int opt=s.nextInt();
		if(opt==1) {
			checkBalance();
		}
		else if(opt==2) {
			withdrawMoney();
		}
		else if(opt==3) {
			depositeMoney();
			
		}
		else if(opt==4) {
			return;
		}
		else {
			System.out.println("Enter a valid choice.");
		}
		
	}
	public void checkBalance() {
		System.out.println("Balance:"+" "+balance);
		
		menu();
	}
	public void withdrawMoney() {
		System.out.println("Enter Amount to withdraw: ");
		Scanner s=new Scanner(System.in);
		float amount=s.nextInt();
		if(amount>balance) {
			System.out.println("Insufficient Balance: ");
		}
		else {
			balance=balance-amount;
			System.out.println("Money Withdrawal Successfully.");
		}
		menu();
		
	}
	public void depositeMoney() {
		System.out.println("Enter the Amount: ");
		Scanner s=new Scanner(System.in);
		float amount=s.nextInt();
		balance=balance+amount;
		System.out.println("Money Deposite Successfully.");
		menu();
		
	}
}

public class TASK3 {
	public static void main(String[]args) {
//		Scanner s=new Scanner(System.in);
//		int pin=s.nextInt();
		
		ATM obj=new ATM();
		
//		int balance=s.nextInt();
		obj.checkPin();
	}

}
