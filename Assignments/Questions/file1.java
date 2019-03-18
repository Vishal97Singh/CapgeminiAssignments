class file1{
  int i;
  byte b;
  char c;
  long l;
  boolean bl;
  float f;
  short s;
  double d;
  public void get()
   {
    System.out.println("Integer : "+i+" Char : "+c+" Byte : "+b+" Short : "+s+" Long : "+l+" Float : "+f+" Double : "+d+" Boolean : "+bl);
   }
  public static void main(String st[]){
    file1 f=new file1();
	f.get();
  }
}