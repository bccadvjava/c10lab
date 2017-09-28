import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CourseFactory {

	private static List<String> labDepts = Arrays.asList("BIO", "CHM", "CIS", "PHY");

	public CourseFactory() {
	}

	public static CollegeCourse getInstance(String dept, int number, String name, int credits) {
		if (labDepts.contains(dept)) {
			return new LabCollegeCourse(dept, number, name, credits);
		} else {
			return new CollegeCourse(dept, number, name, credits);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Dept:");
		String dept = input.nextLine();
		System.out.print("Number:");
		int number = input.nextInt();
		input.nextLine();
		System.out.print("Name:");
		String name = input.nextLine();
		System.out.print("Credits:");
		int credits = input.nextInt();
		CollegeCourse cc = CourseFactory.getInstance(dept, number, name, credits);
		cc.display();
	}
}
