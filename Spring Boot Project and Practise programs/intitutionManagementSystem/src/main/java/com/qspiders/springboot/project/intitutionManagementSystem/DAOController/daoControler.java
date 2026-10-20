package com.qspiders.springboot.project.intitutionManagementSystem.DAOController;

import com.qspiders.springboot.project.intitutionManagementSystem.EmpDAO_IMP.emp_dao_imp;
import com.qspiders.springboot.project.intitutionManagementSystem.EmpDTO.emp_dto;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class daoControler {

    emp_dao_imp dao = new emp_dao_imp();

    // Add Employee
    @PostMapping
    public String addEmployee(@RequestBody emp_dto emp) {
        try {

            System.out.println("Name: " + emp.getName());
            System.out.println("Email: " + emp.getEmail());
            System.out.println("Salary: " + emp.getSalary());


            dao.addEmployee(emp);
            return "Employee added successfully!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }

    // View All Employees
    @GetMapping
    public List<emp_dto> getAllEmployees() {
        return dao.getAllEmployees();
    }
}
