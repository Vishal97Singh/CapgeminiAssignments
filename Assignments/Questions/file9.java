class file9{
  int p;
  static final int s=9;//final should be initialized
  public file9(int p){
	  this.p=p;
  }
  public static void method()
  {
    //s=10; //final variable cannot be changed
	file9 f9=new file9(9); //without object cannot accessed variable p
    System.out.println(f9.p); //error non static cannot be accessed through static method
  }
  public static void main(String st[]){
	  file9 f9=new file9(10);
	  f9.method(); //9
	  
  }
}