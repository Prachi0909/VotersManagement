package VotersSystem;

public class Entities {
	
	private long Id;
	private String Name;
	private int Age;
	private double salary;
	
	public Entities(long Id, String Name,int Age) {
		// TODO Auto-generated constructor stub
		this.setId(Id);
		this.setName(Name);
		this.setAge(Age);
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	
	public String toString() {
		return "Entites [id= " + Id + " name = " + Name + " age = " + Age +"]";
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
	