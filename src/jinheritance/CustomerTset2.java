package jinheritance;

public class CustomerTset2 {

	public static void main(String[] args) {
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 10000);
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		

	}

}
