import java.util.*;
class Employee{
  int empId;
  String empName;
  String date;
  char desigCode;
  String dept;
  double HRA,basic,IT,DA;
  public Employee(int empId,String empName,String date,char desigCode,String dept,double HRA,double basic,double IT,double DA)
  {
   this.empId=empId;
   this.empName=empName;
   this.date=date;
   this.desigCode=desigCode;
   this.dept=dept;
   this.HRA=HRA;
   this.basic=basic;
   this.IT=IT;
   this.DA=DA;
  }
  public void getInfo()
  {
	  double Salary=HRA+basic+IT+DA;
	  System.out.println(" Id  "+" Emp Name  "+" Joinind Date  "+" DesigCode  "+" Deparatment  "+" Total Salary  ");
	  System.out.println(" "+empId+"  "+String.format("%3s",empName)+"  "+String.format("%12s",date)+" "+String.format("%8s",desigCode)+" "+String.format("%14s",dept)+" "+String.format("%14s",Salary)); 
	  
  }

}

class test{
  public static void main(String st[]){
  
    Employee emp[]=new Employee[10];
	emp[0]=new Employee(1001,"Ashish","01/04/2009",'e',"R&D",20000,8000,3000,20000);
	emp[1]=new Employee(1002,"Sushma","23/08/2012",'c',"PM",30000,12000,9000,32000);
	emp[2]=new Employee(1003,"Rahul","12/11/2008",'k',"Acct",10000,8000,1000,12000);
	emp[3]=new Employee(1004,"Chahat","29/01/2013",'r',"Front Desk",2000,3600,1500,15000);
	emp[4]=new Employee(1005,"Ranjan","16/07/2005",'m',"Engg",2700,3000,5500,40000);
	emp[5]=new Employee(1006,"Suman","1/1/2000",'e',"Manufacturing",2000,3000,6000,20000);
	emp[6]=new Employee(1007,"Tanmay","12/06/2006",'c',"PM",3000,3080,5000,32000);
	emp[7]=new Employee(1008,"Vinay","23/09/1987",'k',"Acct",2000,3090,15000,12000);
	emp[8]=new Employee(1009,"Vinayak","23/09/1977",'e',"R&D",2500,3000,5000,20000);
	emp[9]=new Employee(1010,"Vishal","23/09/1997",'c',"PM",80000,35000,15500,32000);
    
	Scanner sc=new Scanner(System.in);
	
    System.out.println("1. Enter e for Engineer\n2. Enter c for Consultant\n3. Enter k for Clerk\n4. Enter r for Receptionist\n5. Enter m for Manager");
    String str=sc.next();
	char ch=str.charAt(0);
	switch(ch){
		case 'e': System.out.println("DA="+20000);
		           break;
	    case 'c': System.out.println("DA="+20000);
		           break;
	    case 'k': System.out.println("DA="+20000);
		           break;
	    case 'r': System.out.println("DA="+20000);
		           break;
	    case 'm': System.out.println("DA="+20000);
		           break;
		default: System.out.println("Wrong Choice");
		           break;
	}
     
	  System.out.println("Enter ID");
	  int id=sc.nextInt(); // Integer.parseInt(st[0])
	  int flag=0,count=0;
	  for(Employee e:emp){
		  if((e.empId)==id){
			  e.getInfo();
			  flag=1;
			  break;
		  }
		 
	  }
	  if(flag==0){
		 System.out.println("EMP not found");
	  }
	  
		
  }
}