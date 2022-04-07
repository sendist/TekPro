
public class Employee extends StaffMember {
	protected String socialSecurityNumber;
	protected double payRate;

	//Sets up an employee
	public Employee(String eName, String eAdress, String ePhone, String socSecNumber, double rate) {
		
		super(eName, eAdress, ePhone);
		
		socialSecurityNumber = socSecNumber;
		payRate = rate;

	}
	
	public String toString() {
		String result = super.toString();
		result += "\nSocial Security Number: " + socialSecurityNumber;
		return result;
	}
	
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return payRate;
	}

}
