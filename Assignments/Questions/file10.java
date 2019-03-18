class file10{
   public static void main(String st[]){
	   java.util.Scanner sc=new java.util.Scanner(System.in);
	   System.out.println("Enter Month Number");
	   int month=sc.nextInt();
	   System.out.println("Enter Year");
	   int year=sc.nextInt();
	   switch(month){
		   case 1: System.out.println(31);
		           break;
		   case 2: if((year%4==0 && year%100!=0)|| year%400==0 )
		             System.out.println(29);
				   else
					 System.out.println(28);
		           break;
		   case 3: System.out.println(31);
		           break;
		   case 4: System.out.println(30);
		           break;
		   case 5: System.out.println(31);
		           break;
		   case 6: System.out.println(30);
		           break;
		   case 7: System.out.println(31);
		           break;
		   case 8: System.out.println(31);
		           break;
		   case 9: System.out.println(30);
		           break;
		   case 10: System.out.println(31);
		           break;
		   case 11: System.out.println(30);
		           break;
		   case 12: System.out.println(31);
		           break;
		   default : System.out.println("Wrong Choice");
		   
		   
	   }
	   
   }
}