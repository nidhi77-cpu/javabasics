/**
 * 
 */
package com.sample.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.sample.registration.model.Employee;

/**
 * @author srinidhi.k
 *
 */
public class Employeedao {
	
	public int registerEmployee(Employee employee) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO employee" +
            "  (EMPLOYEE_ID, EMPLOYEESTARTNAME, EMPLOYEELASTNAME, EMPLOYEEUSERNAME, EMPLOYEEPASSWORD, EMPLOYEEADDRESS, EMPLOYEECONTACT) VALUES " +
            " (?, ?, ?, ?, ?,?,?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:oracle:thin:@localhost:1521:xe", "srinidhi2", "password2");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, employee.getEMPLOYEESTARTNAME());
            preparedStatement.setString(3, employee.getEMPLOYEELASTNAME());
            preparedStatement.setString(4, employee.getEMPLOYEEUSERNAME());
            preparedStatement.setString(5, employee.getEMPLOYEEPASSWORD());
            preparedStatement.setString(6, employee.getEMPLOYEEADDRESS());
            preparedStatement.setString(7, employee.getEMPLOYEECONTACT());

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (Exception e) {
          
        }
        return result;
    }

}
