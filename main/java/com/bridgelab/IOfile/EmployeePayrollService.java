package com.bridgelab.IOfile;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {

	public enum IOService {CONSOLE_IO, FILE_IO, DB_IO, REST_IO}
	
	
	ArrayList<EmployeePayrollData> employeePayrolldata = new ArrayList<>();

	public static void main(String[] args) {
		EmployeePayrollService service = new EmployeePayrollService();
		Scanner sc = new Scanner(System.in);
		service.readEmployeePayrollData(sc);
		service.writeEmployeePayrollData();
	}

	public void readEmployeePayrollData(Scanner sc) {
		System.out.println("Enter Employee ID: ");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String name = sc.next();
		System.out.println("Enter Employee Salary: ");
		double salary = sc.nextDouble();
		employeePayrolldata.add(new EmployeePayrollData(id, name, salary));
	}

	public void writeEmployeePayrollData() {
		System.out.println("\nWriting Employee Payroll Roaster to console\n" + employeePayrolldata);
	}

}
