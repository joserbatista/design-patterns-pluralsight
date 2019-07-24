package com.pluralsight.adapter;

import com.pluralsight.adapter.entity.EmployeeDb;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<EmployeeDb> getEmployeeList() {

        List<EmployeeDb> employees = new ArrayList<>();

        EmployeeDb employeeFromDB = new EmployeeDb("1234", "John", "Wick", "john@wick.com");

        employees.add(employeeFromDB);

        //Will not work! This is where the adapter comes into play!

        //IEmployee employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

        return employees;

    }

}
