
public class Commission extends Hourly {
	//add two more private instance
	private double totalSales;
	private double commissionRate;
	
	//constructor
	public Commission(String eName, String eAdress, String ePhone, String socSecNumber, double rate, double comRate) {
		super(eName, eAdress, ePhone, socSecNumber, rate);
		
		commissionRate = comRate;
	}
	
	public void addSales(double totalSales) {
		this.totalSales += totalSales;
	}
	
	//Return hourly pay + commission from total sale
	@Override
	public double pay() {
		double payment = super.pay() + totalSales * commissionRate;
		totalSales = 0;
		return payment;

	}

	//Add total sales to result 
	@Override
	public String toString() {
		String result = super.toString();
		result += "\nCurrent Total Sales: " + totalSales;
		return result;
	}
}
