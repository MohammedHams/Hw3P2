/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3.pkg3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Marshal
 */
public class P33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Employee[] employees = {
           new Employee(1, "Ahmad", "IT", 1201.2),
           new Employee(2, "Sami", "Sales", 950.8),
           new Employee(5, "Huda", "IT",1010.5),
           new Employee(7, "Ali", "Marketing", 1300.4),
           new Employee(4, "Hani", "Sales", 1050.4)
           };
           List<Employee> listEmployees = Arrays.asList(employees);
           listEmployees.stream()
           .filter(e-> ( e.getSalary() >=800 && e.getSalary() <1200))//filter out employees with a salary outside rage [800-1200)
           .map
           (e-> new Employee(e.getId(), e.getName(), e.getDepartment(), e.getSalary()*1.02))//turn every employee object into new employee,
           //where the salary is multiplied by 1,02
           .collect(Collectors.
           groupingBy(Employee::getDepartment,//collect all the employees, group them by their department, and return count of employee in each department
           Collectors.counting()))
           .forEach((d, c) -> System.out.println("Dept: "+ d + ", Count: " + c));//print the department and the count    }
    
}}
