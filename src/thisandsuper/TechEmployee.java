package thisandsuper;

public class TechEmployee extends Employee
{
	String dsgn;
	int id;
	
	TechEmployee(int id,String name,int salary,String dsgn)
	{
		this.id = id ;
		super.id=id;
		this.name = name;
		this.salary = salary;
		this.dsgn = dsgn;
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary + " " + dsgn);
	}
	public static void main(String[] args) 
	{
		TechEmployee techEmp = new TechEmployee(1, "rahul", 12, "SE");
		
		techEmp.dispData();
	}
}
