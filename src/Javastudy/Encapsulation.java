package Javastudy;
class Bank{
	private int balance;
	private int account_id;
	private int account_ps;
	public String Bank_name;
	public void Balance_chek(){
		System.out.println(balance); 
	}
	public void Print_ID(){
		System.out.println(account_id);
	}
}
public class Encapsulation {

	
	
	public static void main(String[] args) {
		Bank user = new Bank();
		user.Balance_chek();
		user.Print_ID();

		

	}

}
