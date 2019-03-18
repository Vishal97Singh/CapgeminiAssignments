class file2{
  byte b=20;
  short s=100;
  int i=5000;
  long l=1000;
  float f=1001.90f;
  double d=2345.90;
  char c='p';
  boolean bl=true;
  
  //d=i; //we cannot change value here
  public void get(){
	 System.out.println("***********************Byte**********************");
	 b=(byte)s; 
     System.out.println(b);	 
	 b=(byte)i;
	 System.out.println(b);
	 b=(byte)l;
	 System.out.println(b);
	 b=(byte)f;
	 System.out.println(b);
	 b=(byte)d;
	 System.out.println(b);
	 b=(byte)c;
     System.out.println(b);
	 // b=(byte)bl; //boolean cannot
	 
	 System.out.println("***********************Short**********************");
	 s=b; 
     System.out.println(s);	 
	 s=(short)i;
	 System.out.println(s);
	 s=(short)l;
	 System.out.println(s);
	 s=(short)f;
	 System.out.println(s);
	 s=(short)d;
	 System.out.println(s);
	 s=(short)c;
     System.out.println(s);
	 //s=(short)bl; //boolean cannot
	 
	 System.out.println("***********************Integer**********************");
	 i=b; 
     System.out.println(i);	 
	 i=s;
	 System.out.println(i);
	 i=(int)l;
	 System.out.println(i);
	 i=(int)f;
	 System.out.println(i);
	 i=(int)d;
	 System.out.println(i);
	 i=c;
     System.out.println(i);
	// i=bl; //boolean cannot
	
	 System.out.println("***********************Long**********************");
	 l=b; 
     System.out.println(l);	 
	 l=s;
	 System.out.println(l);
	 l=i;
	 System.out.println(l);
	 l=(long)f;
	 System.out.println(l);
	 l=(long)d;
	 System.out.println(l);
	 l=c;
     System.out.println(l);
	 //l=(long)bl; //boolean cannot
	 
	 System.out.println("***********************Float**********************");
	 f=b; 
     System.out.println(f);	 
	 f=s;
	 System.out.println(f);
	 f=i;
	 System.out.println(f);
	 f=l;
	 System.out.println(f);
	 f=(float)d;
	 System.out.println(f);
	 f=c;
     System.out.println(f);
	 //s=(short)bl; //boolean cannot
	 
	 System.out.println("***********************Double**********************");
	 d=b; 
     System.out.println(d);	 
	 d=s;
	 System.out.println(d);
	 d=i;
	 System.out.println(d);
	 d=f;
	 System.out.println(d);
	 d=l;
	 System.out.println(d);
	 d=c;
     System.out.println(d);
	 //s=(short)bl; //boolean cannot
	 
	 System.out.println("***********************Character**********************");
	 c=(char)b; 
     System.out.println(c);	 
	 c=(char)s;
	 System.out.println(c);
	 c=(char)i;
	 System.out.println(c);
	 c=(char)l;
	 System.out.println(c);
	 c=(char)f;
	 System.out.println(c);
	 c=(char)d;
     System.out.println(c);
	 //s=(short)bl; //boolean cannot
  }
  
  public static void main(String st[]){
	  file2 f=new file2();
	  f.get();
  }

}