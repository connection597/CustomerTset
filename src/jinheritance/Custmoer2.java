package jinheritance;

public class Custmoer2 {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
    
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID=customerID;
	}
	public String getCustomerName(String customerName) {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName=customerName ;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade =customerGrade;
	}
}
