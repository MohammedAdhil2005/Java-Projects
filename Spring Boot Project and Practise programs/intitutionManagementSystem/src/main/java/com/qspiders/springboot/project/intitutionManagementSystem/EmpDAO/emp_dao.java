package com.qspiders.springboot.project.intitutionManagementSystem.EmpDAO;

import com.qspiders.springboot.project.intitutionManagementSystem.EmpDTO.emp_dto;

import java.util.List;

public interface emp_dao {

    void addEmployee(emp_dto emp) throws Exception;
    List<emp_dto> getAllEmployees();

}
