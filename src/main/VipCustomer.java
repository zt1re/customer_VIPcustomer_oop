package main;

public class VipCustomer extends Customer {
	
	int Dis;
	int subscriptionFee;
	int subscriptionDate;
	int nowDate;
	
	public VipCustomer(String name, String address, int wallet, int cost, int Dis, int subscriptionFee, int subscriptionDate, int nowDate) {
		super (name, address,  wallet, cost);
		this.Dis = Dis;
		this.subscriptionFee = subscriptionFee;
		this.subscriptionDate = subscriptionDate;
		this.nowDate = nowDate;
	}
	
	public void subscripe() {
		if (subscriptionFee>wallet) {
			this.Dis = 0;
		}
		else {
			this.wallet = wallet - subscriptionFee;
			this.Dis = 50;                                                                                      
		}
	}
	
	public String expire() {
			String str = "";
			if (subscriptionDate<nowDate) {
				str = "Your subscription is expired.";
		    }
			else {
				str = "You are subscribed";
		    }
			return str;
	}

//	cost*(discount/100)
	public void setPay() {
		if (Dis>0) {
			this.Dis = cost*(Dis/100);
			this.cost = cost - Dis;
			System.out.println(cost +"cost with dis");
		}
		
	}
}
