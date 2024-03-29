package edu.baylor.ecs.csi.prototype;

public class Person {
	String firstName;
	String lastName;
	int age;
	Company company;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Person(String firstName, String lastName, int age, Company company) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.company = company;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", works for company=" + company.getName()
				+ "]";
	}
	
}
