import java.util.ArrayList;
import java.util.Collections;
public class BankAccount implements Comparable<BankAccount>
{
	protected Integer balance;
	public BankAccount(int balance)
	{
			this.balance = balance;
	}
	@Override
	public String toString()
	{
		return "balance = "+this.balance;
	}
	public void deposit(int amount)
	{
		this.balance += amount;
	}
	public void withdraw(int amount)
	{
		this.balance -= amount;
	}
	@Override
	public int compareTo(BankAccount arg0)
	{
		return this.balance.compareTo(arg0.balance);
	}
	public static void main(String [] args)
	{
		BankAccount account1 = new BankAccount(250);
		BankAccount account3 = new BankAccount(90);
		BankAccount account2 = new BankAccount(50);
		
		ArrayList<BankAccount> accounts = new ArrayList<>();
		
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		
		Collections.sort(accounts);
		
		System.out.println(accounts);
	}
}