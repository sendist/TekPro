
public class Executive extends Employee {
	private double bonus;
	
	public Executive(String eName, String eAdress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAdress, ePhone, socSecNumber, rate);
		
		bonus = 0;
	}
	
	public void awardBonus(double execBonus) {
		bonus = execBonus;
	}

	@Override
	public double pay() {
		// TODO Auto-generated method stub
		double payment = super.pay() + bonus;
		bonus = 0;
		return payment;
	}
}
