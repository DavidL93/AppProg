public class Exercise6 {
	public static void main(String[] args) {
		BankAccount bankObj = new BankAccount();
                
                bankObj.showBalance();
                if(bankObj.getBalance()>=20){
                    System.out.println("Purchasing movie ticket.");
                    bankObj.withdraw(20.0);
                    bankObj.showBalance(); 
                } else{
                    System.out.println("You need more money to buy a movie ticket.");
                }
                
               
	}
}
