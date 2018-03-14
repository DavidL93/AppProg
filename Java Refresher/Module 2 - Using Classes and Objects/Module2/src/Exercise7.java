public class Exercise7 {
	public static void main(String[] args) {
            BankAccount jackObj = new BankAccount();
            BankAccount jillObj = new BankAccount();
            
            jackObj.showBalance();
            jillObj.showBalance();
            
            jackObj.transfer(10.0, jillObj);
            jackObj.showBalance();
            jillObj.showBalance();
	}
}
