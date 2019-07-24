package com.pluralsight.adapter;

import com.pluralsight.adapter.entity.EmployeeDb;

import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();

        List<EmployeeDb> employees = client.getEmployeeList();

        System.out.println(employees);
    }
}
