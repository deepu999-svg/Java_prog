package deepuu;
import java.util.Scanner;
import java.util.Random;

public class MyBank_PEC {
    private String accountNumber;
    private String accountHolder;
    int password;
    private double balance;

    public MyBank_PEC(String accountNumber, String accountHolder ,Scanner s) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        System.out.println("please enter a password 4 digit pin to your account");
        this.password=s.nextInt();
        System.out.println("this is your account number: " + accountNumber);
        this.balance = 0.0; 
    }

    public void deposit(double amount) {
      
            balance += amount;
            System.out.println("Amount deposited successfully the Balance is: " + balance);
       
    }

    public void withdraw(double amount ,Scanner s) {
    	  System.out.println("please enter 4 digit pin");
    	  int temp_pass=s.nextInt();
         if(temp_pass==password) {
         if (amount > balance) {
            System.out.println("insufficient balance");
        } else {
            balance -= amount;
            System.out.println("amount withdrawn successfully the remaining Balance: " + balance);
        }
         }else {
        	 System.out.println("password is incorrect \'stealing is bad bro\': "); 
         }
    }

	/* still under devlopment
	 * public void transfer_money(MyBank_PEC diffAccount, double amount ,Scanner s)
	 * { if (amount <=balance) { this.withdraw(amount,s);
	 * diffAccount.deposit(amount);
	 * System.out.println("money trasfered sucessfully New Balance: " +
	 * this.balance); } else { System.out.println("insufficient balance"); } }
	 */

    public void AccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: " + balance);
    }
//these getter setter  methods are useful when we use another class or package and use this prog to create account 
   
    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public void setAccountHolder(String accountHolder) { this.accountHolder = accountHolder; }
    public double getBalance() { return balance; }
    
    public static void main(String[] args) {
    	MyBank_PEC user = null;
    	String name;
    	int age;
    	boolean flag=false;
    	System.out.println("HI welcome to PEC bank");
    	System.out.println("if you are a new user create a new account");
    	 Random rand = new Random();
    	 Scanner sc = new Scanner(System.in);
    	long acno = rand.nextLong(100000000000l);
    	String accno=Long.toString(acno);
    	while(true) {
    	System.out.println("1 : Creation of new account");
    	System.out.println("2 : Access the excisted acount\n3 : Exit from the bank");
    	System.out.println("Enter your choice:[1-3]");
    	int cho=sc.nextInt();
    	sc.nextLine();
    	switch (cho) {
		case 1 :
		{	if(flag) {
			System.out.println("you already created your account");
			break;
		}
			System.out.println("Kindly pleasee enter your name in block letters");
			name=sc.nextLine();
			System.out.println("please enter your age");
			age=sc.nextInt();
			if (!(age>=18)) {
				System.out.println("you are not eligible to create a bank account");
				break;
			}
			user=new MyBank_PEC(accno,name,sc);
			flag=true;
			break;
			
		}
		case 2:
		{
			if(flag)
			{
				while(true) {
					System.out.println("what you want to do next");
			    	System.out.println("1 : Deposit money");
			    	System.out.println("2 : withdraw money\n3 : Get_accountdetails\n4 : Exit_bank");
			    	System.out.println("Enter your choice:[1-3]");
			    	int icho=sc.nextInt();
			    	sc.nextLine();
			    	switch (icho) {
					case 1 :
					{	
						System.out.println(" please enter the amount to be deposited");
						double damo=sc.nextDouble();
						sc.nextLine();
						user.deposit(damo);
						break;
					}
					
					case 2:
					{
						System.out.println(" please enter the amount to be withdrawn");
						double damo1=sc.nextDouble();
						sc.nextLine();
						user.withdraw(damo1,sc);
						break;
					}
					case 3:
					{
						user.AccountDetails();
						break;
					}
					case 4:
					{
						System.out.println("Thankyou for using our bank have a good day:)");
						System.exit(0);
					}
			    	}	
			}}
			else {
				System.out.println("Kindly pleasee create an account first");
				break;
			}
		}
		case 3:
		{
			System.out.println("Thankyou for using our bank have a good day:)");
			System.exit(0);
		}
		
		
    	}
    	}
    	
    }
}

