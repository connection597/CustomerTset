package jinheritance; //customer클래스 구현하기

public class Customer {  //변수
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer(int customerID, String customerName) { // 기본 등급과 적립비율
		this.customerID =customerID;
		this.customerName= customerName;
		customerGrade ="SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}
	public int calcPrice(int price) {
		return bonusPoint +=price*bonusPoint;
	}
	
	public String showCustomerInfo() { // 고객정보 반환하기 메소드
		return customerName +"님의 등급은"
	+ customerGrade +"이며 , 보너스포인트는"+bonusPoint+"입니다";
	}
	public class VIPCustomer{
		private int customerID;
		private String customerName;
		private String custemerGrade;
		int bonusPoint;
		double bonusRatio;
		
		private int agentID; //VIP고객 상담원 아이디
		double saleRatio; //할인율
		
		public VIPCustomer() {
			customerGrade = "VIP"; //고객등급
			bonusRatio =0.05; //보너스 적립
			saleRatio =0.1;// 할인율 10%
		}
		public int calcPrice(int price) {
			bonusPoint +=price*bonusRatio;
			return price -(int)(price*saleRatio);//할인률 적용
		}
		public String showCustomerInfo() {
			return customerName +"님의 등급은"
		+customerGrade+"이며, 보너스포인트는"+bonusPoint+"입니다";
		}
		
	}
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
		}
	public void setCustomerID(int customerID) {
		this.customerID= customerID;
		// TODO Auto-generated method stub
		
	}
	public String getCustomerName() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
