package com.qspiders.springboot.project.intitutionManagementSystem.EmpDAO_IMP;

import com.qspiders.springboot.project.intitutionManagementSystem.Connection.connectionFactory;
import com.qspiders.springboot.project.intitutionManagementSystem.EmpDAO.emp_dao;
import com.qspiders.springboot.project.intitutionManagementSystem.EmpDTO.emp_dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class emp_dao_imp implements emp_dao {

    @Override
    public void addEmployee(emp_dto emp) {

        String sql = "INSERT INTO emp (name, email, salary) VALUES (?, ?, ?)";

        try (Connection con = connectionFactory.ConnectionFactory();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getEmail());
            ps.setDouble(3, emp.getSalary());

            ps.executeUpdate();

            System.out.println("Employee added successfully!");

        }  catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<emp_dto> getAllEmployees() {

        List<emp_dto> employees = new ArrayList<>();

        String sql = "SELECT * FROM emp";

        try (Connection con = connectionFactory.ConnectionFactory();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                emp_dto emp = new emp_dto(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("salary"),
                        rs.getString("email")
                );

                employees.add(emp);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return employees;
    }
}
