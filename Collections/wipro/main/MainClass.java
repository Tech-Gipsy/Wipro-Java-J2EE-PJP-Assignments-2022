package com.wipro.main;

import com.wipro.bean.EmployeeBean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainClass {
    public static void main(String[] args)
    {
        EmployeeService es=new EmployeeService();
        EmployeeBean[] e=new EmployeeBean[5];
        e[0]=new EmployeeBean();
        e[0].setName("Bunu");
        e[0].setEmpID(1024);
        e[0].setSalary(500000);
        e[0].setDesignation("Ceo");
        e[1]=new EmployeeBean();
        e[1].setName("Roo");
        e[1].setEmpID(1025);
        e[1].setSalary(400000);
        e[1].setDesignation("Cto");
        e[2]=new EmployeeBean();
        e[2].setName("heffalump");
        e[2].setEmpID(1026);
        e[2].setSalary(300000);
        e[2].setDesignation("Cfo");
        System.out.println(es.insertEmployee(e[0]));
        System.out.println(es.insertEmployee(e[2]));
        printall(es.fetchAllEmployees());
        System.out.println(es.insertEmployeeByPosition(e[1],0));
        printall(es.fetchAllEmployees());
        System.out.println(es.deleteEmployeeByEmpID(1025));
        printall(es.fetchAllEmployees());
        e[3]=new EmployeeBean();
        e[3].setName("jarvis");
        e[3].setEmpID(1026);
        e[3].setSalary(304220);
        e[3].setDesignation("sdfo");
        System.out.println(es.updateEmployeeByEmpID(e[3]));
        printall(es.fetchAllEmployees());
        System.out.println("Searching for employee with empid :1026");
        EmployeeBean q=es.findEmployeeByEmpID(1026);
        if (q!=null)
            System.out.println(q.toString());
        else
            System.out.println("No data found with empid :1026");

        System.out.println("Searching");
        EmployeeBean q1=es.findEmployeeByEmpID(1);
        if (q1!=null)
            System.out.println(q1.toString());
        else
            System.out.println("No data found with empid :1");

    }
    public static void printall(List l)
    {
        Iterator itr=l.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next().toString());
        }

    }
}
