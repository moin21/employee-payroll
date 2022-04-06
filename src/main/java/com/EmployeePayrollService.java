package com;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    /**
     * Creating arrayList of EmployeePayrollData type - employeePayrollDataList.
     */
    private final List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();

    /**
     * Main Method - Creating object of EmployeePayrollService - employeePayrollService.
     * Creating Scanner object to take user input.
     * Calling readEmployeePayrollData method to read employee payroll data with consoleInputReader as param.
     * Calling writeEmployeePayrollData method to print employee payroll data.
     */
    public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        consoleInputReader.close();
        employeePayrollService.writeEmployeePayrollData();
    }

    /**
     * Method to read employee payroll data.
     * Using try catch block to handle InputMismatchException.
     * Taking user input for employeeId, employeeName and employeeSalary.
     * Adding new elements with above values in employeePayrollDataList.
     *
     * @param consoleInputReader - Scanner object to take user input.
     */
    private void readEmployeePayrollData(Scanner consoleInputReader) {
        try {
            System.out.println("Enter Employee ID: ");
            int employeeId = consoleInputReader.nextInt();
            System.out.println("Enter Employee Name: ");
            String employeeName = consoleInputReader.next();
            System.out.println("Enter Employee Salary: ");
            double employeeSalary = consoleInputReader.nextDouble();
            employeePayrollDataList.add(new EmployeePayrollData(employeeId, employeeName, employeeSalary));
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Please enter valid payroll details");
        }

    }

    /**
     * Method to print employee payroll data.
     */
    private void writeEmployeePayrollData() {
        System.out.println("Employee Payroll is: "+employeePayrollDataList);
    }
}
