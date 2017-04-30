package prob04;

public class Depart extends Employee {
	private String department;
	
	public Depart(String name, int salary, String dep ) {
		setName(name);
		setSalary(salary);
		department = dep;
		

	}
	
	public void getInformateion() {
		System.out.println( "이름:" + getName() + "연봉:" + getSalary() + "부서:" + department );
	}

}
