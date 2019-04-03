package com.igate.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.igate.labs.Department;
import com.igate.labs.EmployeeRepository;
import com.igate.streamlab.Employee;
public class EmployeeService  {
	
	public static void main(String args[]) {
	List<Employee> li=new ArrayList<Employee>();
	li=EmployeeRepository.getEmployees();
	
	//Sum Salary
    double sal=li.stream().map(Employee->Employee.getSalary()).reduce(0.0, (a,b)->a+b);
    System.out.println(sal);
    
    //Counting Number of employee in each department
    Map<Department,Long> d= li.stream().filter(Employee->Employee.getDepartment()!=null).
    map(Employee->Employee.getDepartment()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    System.out.println(d);
    
    Map<Department,Long> d1= li.stream().filter(Employee->Employee.getDepartment()!=null).collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
    d1.forEach((k,v)->{
    	System.out.println(k.getDepartmentName()+"\t"+v);
    });
     
    //Seniority
    Employee count= li.stream().max((Employee e1, Employee e2)->e1.getHireDate().isBefore(e2.getHireDate())?1:-1).get();
    System.out.println(count);
    

for(Employee f:li)
{
	LocalDate a = f.getHireDate();

    System.out.println(f.getFirstName()+" "+f.getLastName()+" "+f.getHireDate()+" "+a.getDayOfWeek().name());
}
System.out.println("^^^^^^^^^^^^^^^^^^^");
for(Employee e:li)
{
	LocalDate b = e.getHireDate();
	if(b.getDayOfWeek().name().equalsIgnoreCase("FRIDAY"))
	{
		System.out.println(e.getFirstName()+" "+e.getLastName()+" "+e.getHireDate());
	}
}
System.out.println("---------------------");
for(Employee e:li)
{System.out.println(e.getManagerId()+"-----");
	for(Employee e1:li)
	{
		
		System.out.println(e1.getEmployeeId());
		if(e.getManagerId()==e1.getEmployeeId())
		{
			
			System.out.println(e.getFirstName()+" reports to "+e1.getFirstName());
		}
	}
}

System.out.println("*******************************************");
for(Employee t:li)
{
  Double gf=((t.getSalary()*15)/100)+t.getSalary();
  System.out.println(t.getFirstName()+" "+t.getLastName()+" Original salary"+t.getSalary()+" After Increment"+gf);
}
System.out.println("**********************************************");
li.stream().filter(u->u.getManagerId()==null).forEach(System.out::println);

System.out.println("*****************************************************");

li.stream().sorted((e1,e2)->e1.getEmployeeId().compareTo(e2.getEmployeeId())).forEach(System.out::println);
System.out.println("******************************************************");
li.stream().filter(p->p.getDepartment()!=null).sorted((p1,p2)->p1.getDepartment().getDepartmentId()<p2.getDepartment().getDepartmentId()?1:-1).forEach(System.out::println);;
System.out.println("*********************************************************");
li.stream().sorted((r1,r2)->r1.getFirstName().compareTo(r2.getFirstName())).forEach(System.out::println);

	}
}
