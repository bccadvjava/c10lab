
public class CollegeCourse {

	protected String dept;
	protected int number;
	protected String name;
	protected int credits;
	
	protected static int feePerCredit = 120;
	
	public CollegeCourse(String dept, int number, String name, int credits) {
		super();
		this.dept = dept;
		this.number = number;
		this.name = name;
		this.credits = credits;
	}

	public String getDept() {
		return dept;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return dept;
	}

	public int getCredits() {
		return credits;
	}

	public static int getFeePerCredit() {
		return feePerCredit;
	}
	
	public void display() {
		System.out.println(dept + '-' + number);
		System.out.println(name);
		System.out.println(credits + " credits");
		this.printFees();
	}
	
	protected void printFees() {
		System.out.println("Fees: $" + (credits * feePerCredit));
	}
	
	public static void main (String[] args) {
		CollegeCourse advJava = new CollegeCourse("CIS", 250, "Advanced Java", 3);
		advJava.display();
	}

}
