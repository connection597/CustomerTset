package jinheritance;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); //컴파일러가 자동으로 추가 돼는 코드
		customerGrade ="VIP";
		bonusRatio =0.05;
		saleRatio = 0.1;
	    System.out.println("VIPCustomer() 생성자 호출");
	}
	public int getAgentID() {
		return agentID;
	}

}
