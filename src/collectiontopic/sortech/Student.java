package collectiontopic.sortech;

public class Student implements Comparable<Student>
{
	private int rno,std;
	private String name;
	
	public Student(int rno,  String name,int std) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	
	
	
	
	public int getRno() {
		return rno;
	}




	public void setRno(int rno) {
		this.rno = rno;
	}




	public int getStd() {
		return std;
	}




	public void setStd(int std) {
		this.std = std;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}

	public void dispData()
	{
		System.out.println(rno+" " + name+" " + std);
	}

	// provide ===> sorting defination
	@Override
	public int compareTo(Student s2) 
	{
		if(getStd() > s2.getStd()) 
		{
			return 1;
		}else if(getStd() < s2.getStd())
		{
			return -1;
		}else 
		{
			return 0;
		}	
	}
}
