package com.wipro.main;

import com.wipro.bean.EmployeeBean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeService {
    private List<EmployeeBean> listEmp = new ArrayList<>();

    public boolean insertEmployee(EmployeeBean bean) {

        return listEmp.add(bean);

    }

    public String insertEmployeeByPosition(EmployeeBean bean, int position) {
        listEmp.add(position, bean);
        return "Inserted employee at position" + position;
    }

    public List<EmployeeBean> fetchAllEmployees() {
        if (listEmp.isEmpty()) {
            return null;
        }
        return listEmp;
    }

    public boolean deleteEmployeeByEmpID(int empID) {
        int x;
        Iterator<EmployeeBean> itr = listEmp.iterator();
        while (itr.hasNext()) {
            EmployeeBean e = itr.next();

            if (e.getEmpID() == empID) {
                listEmp.remove(e);
                return true;
            }

        }
        return false;
    }

    public boolean updateEmployeeByEmpID(EmployeeBean bean) {
        int x;
        Iterator<EmployeeBean> itr = listEmp.iterator();
        while (itr.hasNext()) {
            EmployeeBean e = itr.next();

            if (e.getEmpID() == bean.getEmpID()) {
                listEmp.set(listEmp.indexOf(e), bean);
                return true;
            }

        }
        return false;
    }

    public EmployeeBean findEmployeeByEmpID(int empID)
    {
        int x;
        Iterator<EmployeeBean> itr = listEmp.iterator();
        while (itr.hasNext()) {
            EmployeeBean e = itr.next();

            if (e.getEmpID() == empID) {
                   return e;
            }

        }
        return null;

    }

}
