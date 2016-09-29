package encapsulation;

public class SavingsAccount {
	private Integer balance;
	private double interest_rate;

	
	public SavingsAccount (int balance, double interest_rate)
	{
		this.balance = balance;
		this.interest_rate = interest_rate;
		
	}
	
	public Integer getBalance()
	{
		return this.balance;
	}
	
	public double getInterestRate()
	{
		return this.interest_rate;
		
	}
	
	public Integer add(Integer amount)
	{
		this.balance += amount;
		return this.balance;
		
	}
	
	public Integer subtract(Integer amount)
	{
		this.balance -= amount;
		return this.balance;
	}
	
	public Integer accrue()
	{
		int interest = (int) (this.balance * this.interest_rate);
		this.balance += interest;
		return this.balance;
		
	}
	
	public String toString()
	{
		return "Balance: " + this.balance + " @ Interest Rate " + this.interest_rate;
		
	}
	
	public static void main(String[] args)
	{
		SavingsAccount my_savings = new SavingsAccount(100, .5);
		System.out.println(my_savings.getBalance());
		System.out.println(my_savings.add(50));
		System.out.println(my_savings.accrue());
		System.out.println(my_savings);
		
		
	}
}

