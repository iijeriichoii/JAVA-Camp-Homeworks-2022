package inheritance;

public class EmployeeManager extends PersonManager {
	public void List() {
		System.out.println("Customer Listed.");
	}

	public void Add() {
		System.out.println("Customer Added.");
	}

	public void BestEmployee() {
		System.out.println("Employee of the Month.");
	}
}
