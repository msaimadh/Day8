package com.capgemini.day9;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.domain.Employee;
@WebServlet("/employee")
public class EmployeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Employee> employee = new ArrayList<>();
	ServletContext context;
	Employee emp1;
	Employee emp2;
	Employee emp3;
	Employee emp4;
	Employee emp5;

	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
		emp1 = new Employee("12","jim",34000.0,"IT");
		emp2 = new Employee("13","tom",40000.0,"IT");
		emp3 = new Employee("14","jack",45000.0,"IT");
		emp4 = new Employee("15","jerry",50000.0,"IT");
		
		
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		employee.add(emp4);
		employee.add(emp5);
	}

	public EmployeesServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text.html");
		PrintWriter out = response.getWriter();
		String empID = request.getParameter("employeeId");
		boolean fl=false;
		for(Employee employee: employee) {
			
			if(employee.getEmployeeId().equals(empID)) {
				fl=true;
				out.println("<p>EmpId= "+employee.getEmployeeId()+"<br><br>"+"Name= "+employee.getEmployeeName()+"<br><br>"+"Salary="+employee.getEmployeeSalary()+"<br><br>"+"Department"+employee.getDepartment()+"</p>");
				
			}
			
		}
		if(fl);
		else {
			out.println("Employee ID not found");
		}
		out.close();
		

	}

}


