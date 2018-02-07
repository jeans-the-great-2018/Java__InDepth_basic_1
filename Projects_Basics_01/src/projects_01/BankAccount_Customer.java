package projects_01;

public class BankAccount_Customer {

	public static void main(String[] args) {
		BankAccount icici = new BankAccount("keerthi");
		icici.getCustomer().setEmail("k@email.com");
		icici.customerWithdrawFund(50.00d);
		icici.customerDepositFund(49.99d);
		icici.customerWithdrawFund(50.00d);
		icici.customerDepositFund(1.99d);
		icici.customerWithdrawFund(50.00d);
	}

}

class BankAccount{
	private Double accountNumber;
	private double balance;
	private Customer customer;
	
	public BankAccount(String customerName) {
		super();
		this.accountNumber = (Double)Math.random();
		this.balance = 0.0d;
		this.customer = new Customer(customerName);
	}
	
	public boolean customerDepositFund(double amount) {
		if(amount>0d) {
			balance += amount;
			return true;
		}
		return false;
	}
	public boolean customerWithdrawFund(double amount) {
		if(amount>0.0d) {
			double temporary = balance;
			if((balance-=amount)>=0.0d) {
				System.out.println(this.toString()
						+" :withdraw amount is "+amount);
				return true;
			}else {
				setBalance(temporary);
				System.out.println(this.toString()
						+" :withdraw declined as amount is "+amount+" greater ");

			}
		}
		return false;
	}
	public Double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Double accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + String.format("%.2f", balance) + ", customer=" + customer + "]";
	}

	public Customer getCustomer() {
		return customer;
	}
}


class Customer{
	
	public Customer(String customerName, String email, Long phoneNumber) {
		this(customerName);
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public Customer(String customerName) {
		super();
		this.customerName = customerName;
		//this.email = "";
		//this.phoneNumber = 0000000000l;
	}
	private String customerName;
	private String email;
	private Long phoneNumber;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	
}