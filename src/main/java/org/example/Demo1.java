package org.example;
import org.example.Algorithm.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
public class Demo1 {
    public static void main(String[] args) {
        Employees e = new Employees();
        Employee e1 = new Employee();
        e1.setEmpId(1);
        e1.setFirstName("Makarand");
        e1.setLastName("Hinge");
        Employee e2 = new Employee();
        e2.setEmpId(1);
        e2.setFirstName("Ritesh");
        e2.setLastName("Dalavi");
        List<Employee> list = new ArrayList();
        list.add(e1);
        list.add(e2);
        e.setEmployee(list);
        for(Employee i : e.getEmployee()){
            System.out.println(i.getEmpId());
            System.out.println(i.getFirstName());
            System.out.println(i.getLastName());
        }

    }
}


class Employees{
    private List <Employee> employee;

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}

class Employee{
    private int empId;
    private String firstName;
    private String lastName;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getEmpId() {
        return empId;
    }
}

