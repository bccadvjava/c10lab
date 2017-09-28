
public class LabCollegeCourse extends CollegeCourse {

	private static int labFee = 50;
	
	public LabCollegeCourse(String dept, int number, String name, int credits) {
		super(dept, number, name, credits);
	}

	protected void printFees() {
		System.out.println("This is a lab course");
		System.out.println("Basic Fees: $" + (credits * feePerCredit));
		System.out.println("   Lab Fees: $" + labFee);
		System.out.println(" Total Fees: $" + ((credits * feePerCredit) + labFee));
	}
	
	public static void main (String[] args) {
		CollegeCourse advJava = new LabCollegeCourse("CIS", 250, "Advanced Java", 3);
		advJava.display();
	}

}
