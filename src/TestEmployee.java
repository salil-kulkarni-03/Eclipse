
public class TestEmployee {
	public static void main(String[] args) {

		Manager m = new Manager(1500,800);

		Clerk c = new Clerk(1200,400);
		
		showSalary(m);
		showSalary(c);
		
	}
	
	private static void showSalary(Employee e) {
		if(e instanceof Manager) {
			System.out.println("Manager salary: " + e.getSalary());
		}else {
			System.out.println("Clerk salary: " + e.getSalary());
		}
		
	}
}
