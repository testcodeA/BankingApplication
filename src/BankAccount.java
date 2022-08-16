import java.util.Scanner;

public class BankAccount {
      String customerName;
      int accNo;
      long balance;
      long previousTransaction;
      
      BankAccount(String customerName,int accNo){
    	  this.customerName= customerName;
    	  this.accNo=accNo;
      }
      void deposit(int amount){
    	  if(amount>0 && amount !=0 ){
    		  System.out.println("Amount deposited is: "+amount);
    		  balance+=amount;
    		  System.out.println("Your account balance is: "+balance);
    		  previousTransaction= amount;
    	  } 
      }
      void withdraw(int amount){
    	  if(amount>0 && amount!=0 ){
    	  System.out.println("Amount withdrawn is: "+amount);
    	  balance-=amount;
    	  System.out.println("Your Account balance is: "+balance);
    	  previousTransaction = -amount;
    	  }
      }
      void balance(){
    	  System.out.println("Your account balance is: "+balance);
      }
      void previousTransaction(){
    	  if(previousTransaction>0){
    		  System.out.println("Deposited: "+previousTransaction);
    	  }else if(previousTransaction<0){
    		  System.out.println("Withdrawn: "+Math.abs(previousTransaction));
    	  }else{
    		  System.out.println("No transaction recorded");
    	  }
      }
      void showMenu(){
    	  char option='\0';
    	  Scanner sc= new Scanner(System.in);
    	  System.out.println("Welcome "+customerName);
    	  System.out.println("Your Account Number: "+accNo);
    	  System.out.println("Enter an Option from A-E: ");
    	  System.out.println("A: Deposit Amount");
    	  System.out.println("B: Withdraw Amount");
    	  System.out.println("C: Balance in Account");
    	  System.out.println("D: Previous Transaction");
    	  System.out.println("E: Exit from Application");
    	  do{
    		  System.out.println("Enter an option from A-E");
    		  option= sc.next().charAt(0);
    		  switch(option){
    		  case 'A':System.out.println("Deposit Amount");
    		  int amount= sc.nextInt();
    		  deposit(amount);
    		  break;
    		  
    		  case 'B': System.out.println("Withdraw Amount");
    		  int amount2= sc.nextInt();
    		  withdraw(amount2);
    		  break;
    		  
    		  case 'C':System.out.println("Balance in Account");
    		  balance();
    		  break;
    		  
    		  case 'D': System.out.println("Previous Transaction");
    		  previousTransaction();
    		  break;
    		  
    		  case 'E': System.out.println("Exit from Application");
    		  break;
    		  default: System.out.println("Invalud Entry");
    		  }
    	  }while(option!='E');
    	  System.out.println("Thankyou for using Our Application");
      }
   }

