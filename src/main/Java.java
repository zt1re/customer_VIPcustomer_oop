package main;

public class Java {

	public static void main(String[] args) {
		VipCustomer ali = new VipCustomer("ali", "a", 100, 50, 50, 10, 929, 729);
		System.out.println(ali.getWallet());
		
		ali.setPay();
		System.out.println(ali.pay());
		
		System.out.println(ali.expire());
		ali.subscripe();
		ali.setPay();
		System.out.println(ali.pay());
		System.out.println(ali.getWallet());
		
	}

}
