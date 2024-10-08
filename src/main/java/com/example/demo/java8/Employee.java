package com.example.demo.java8;

import java.util.List;

public class Employee {

	public Long id;
	private String name;
	private String lastName;
	private List<Long> phoneNumbers;
	private Long salary;
	private String isActive;
	private int age;
	private String department;

	public Employee(String name, List<Long> phoneNumbers, Long salary) {
		this.name = name;
		this.phoneNumbers = phoneNumbers;
		this.salary = salary;
	}

	public Employee(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	public Employee(Long id, String name, String lastName, String isActive, Long salary, int age) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.isActive = isActive;
		this.salary = salary;
		this.age = age;
	}

	public Employee(Long id, String name, String lastName, String isActive, Long salary, int age, String department) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.isActive = isActive;
		this.salary = salary;
		this.age = age;
		this.department = department;
	}

	public List<Long> getPhoneNumbers() {
		return phoneNumbers;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public Long getSalary() {
		return salary;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPhoneNumbers(List<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + ", phoneNumbers=" + phoneNumbers
				+ ", salary=" + salary + ", isActive=" + isActive + ", age=" + age + ", department=" + department + "]";
	}

}
