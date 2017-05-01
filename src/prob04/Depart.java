package prob04;

public class Depart extends Employee {
	private String department;
	
	public Depart(String name, int salary, String dep ) {
		super(name, salary);
		department = dep;
		

	}
	@Override
	public void getInformation() {
		System.out.println( "이름:" + getName() + "\t연봉:" + getSalary() + "\t부서:" + department );
	}

}
