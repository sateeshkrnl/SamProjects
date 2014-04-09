package com.emp.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Session Bean implementation class EmployeeBean
 */
@Stateless
@LocalBean
@WebService(serviceName="EmployeeBeanService")
public class EmployeeBean {

    /**
     * Default constructor. 
     */
    public EmployeeBean() {
        // TODO Auto-generated constructor stub
    }
    @WebMethod(operationName="getEmployee")
    public Employee getEmployee(String empId){
    	return new Employee(empId);
    }

}
