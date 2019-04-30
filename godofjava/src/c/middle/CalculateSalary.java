package c.middle;

public class CalculateSalary {
	public static void main(String[] args) {
		CalculateSalary salary = new CalculateSalary();
		salary.calculateSalaries();
	}
	public long getSalaryIncrease(Employee employee) {
		int type = employee.getType();
		long salary = employee.getSalary();
		switch(type) {
		case 1:
			salary = (long) (salary * (1 - 0.95));
			break;
		case 2:
			salary = (long) (salary * (1 + 0.1));
			break;
		case 3:
			salary = (long) (salary * (1 + 0.2));
			break;
		case 4:
			salary = (long) (salary * (1 + 0.3));
			break;
		case 5:
			salary = (long) (salary * (1 + 1.0));
			break;
		}
		return salary;
	}
	public void calculateSalaries() {
		Employee[] employees = new Employee[5];
		employees[0] = new Employee("LeeDaeRi", 1, 1000000000);
		employees[1] = new Employee("KimManager", 2, 100000000);
		employees[2] = new Employee("WhangDesign", 3, 70000000);
		employees[3] = new Employee("ParkArchi", 4, 80000000);
		employees[4] = new Employee("LeeDevelop", 5, 60000000);
		
		for (Employee employee:employees) {
			long newSalary = getSalaryIncrease(employee);
			System.out.println(employee.getName() + "=" + newSalary);
		}
	}
}
