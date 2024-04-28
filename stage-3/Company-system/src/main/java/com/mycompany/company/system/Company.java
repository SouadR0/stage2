
package com.mycompany.company.system;

import java.util.ArrayList;


public class Company {
    
    public String name;
    public Employee head;
    ArrayList<Department> departments;
    
    public Company(String name, Employee head) {
        this.name = name;
        this.head = head;
        this.departments = new ArrayList<>();
    }
    
    public void addDepartment(Department department) {
        this.departments.add(department);
    }
    
    public void removeDepartment(Department department) {
        this.departments.remove(department);
    }
}
