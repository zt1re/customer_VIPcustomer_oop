package main;
import java.util.*;

public abstract class Customer {
	
	String name;
	String address;
	int wallet;
	int cost;
	
	public  Customer (String name, String address, int wallet, int cost) {
		this.name = name;
		this.address = address;
		this.wallet = wallet;
		this.cost = cost;
	}
	
	public abstract void setPay();
	
	public String pay() {
		if (cost>wallet) {
			return "You donot have enougth money.";
		}
		else {
			this.wallet = wallet-cost;
			return "Done";
		}
	}
	
	public void toput() {
		System.out.println("Enter to add money: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		this.wallet = wallet+num;
		
	}
	
	public int getWallet() {
		return wallet;
	}
}
