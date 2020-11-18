package jinheritance; //클래스 형변환 매소드

public class OverridingTset2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030 ,"나몰라", 2000);
		vc.bonusPoint=1000;
		
		System.out.println(vc.getCustomerName()
				+"님이 지불할 금액은"+vc.calcPrice(10000)+"원 입니다");
	}

}
