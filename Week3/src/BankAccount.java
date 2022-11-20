

 /**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
 */
public class BankAccount
{  
   // private instance variables—filled in later
    private double balance = 0.0;
    // TODO: define an instance variable for BankAccount owner name
     String ownerName = "";
   /**
      TODO: Write a constructor to construct a bank account with a zero balance.
   */
	
   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
	   
	   balance = initialBalance;
	   ownerName = "Mayank Kushwaha";
	   
	   // TODO: implement this method
   }
   
   public BankAccount (String Name) {
	   this(0.0);
	   this.ownerName = Name;
	   
   }
   
   public BankAccount (double balance, String Name) {
	   this.balance = balance;
	   this.ownerName = Name;
	   
   }
   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
	   
	   balance =  balance + amount;
	   // TODO: implement this method
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      balance = balance - amount; 
	   // TODO: implement this method
   }
   
	/*
	 * public boolean withdraw(double amount) {  
	 *Cannot overload a method with only a different return type 
	 * }
	 */
   public String oName() {
	return ownerName;    
   }
   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      // TODO: modify this method behavior to do the right thing
      return balance;
   }
   
   public static void main(String[] args) {
	   //TODO: Create and instance of BankAccount here
	   BankAccount BA = new BankAccount(0);
	   //TODO:  print the BankAccount balance
	   // System.out.println(BA.oName() + "'s Account Balance is: ");
	   System.out.println();
	   System.out.println("Owner of the account is: " + BA.oName());
	   System.out.println("Initial Balance: " + BA.getBalance());
	   //TODO: add $500 to the newly created BanckAccount
	   BA.deposit(500);
	   //TODO:  print the BankAccount balance
	   System.out.println("Final Balance: " + BA.getBalance());
	   
	   
	   System.out.println();
	   BankAccount BA2 =  new BankAccount("Rohan");
	   System.out.println("Owner of the second account is: " + BA2.oName());
	   System.out.println("Initial Balance: " + BA2.getBalance());
	   BA2.deposit(1500);
	   System.out.println("Final Balance: " + BA2.getBalance());
	   
   }
}

