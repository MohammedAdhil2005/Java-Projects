package com.qspiders.springboot.project.intitutionManagementSystem.EmpMain;

import com.qspiders.springboot.project.intitutionManagementSystem.EmpDAO.emp_dao;
import com.qspiders.springboot.project.intitutionManagementSystem.EmpDAO_IMP.emp_dao_imp;
import com.qspiders.springboot.project.intitutionManagementSystem.EmpDTO.emp_dto;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class emp_main {
    public static void main(String[] args) {
    emp_dto ett=new emp_dto(01,"Adhil",75000,"adhil@gmail.com");
    emp_dao_imp dao = new emp_dao_imp();
    dao.addEmployee(ett);
    }
}
