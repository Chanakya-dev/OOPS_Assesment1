public class Emp{
// Take 4 Variables of Emp Data With an Access Modifier Private
  // Prepare toString()
  private int a;
  private double b;
  private String c;
  private int d;

  public int getA() {
    return a;
  }
  public void setA(int a) {
    this.a = a;
  }
  public double getB() {
    return b;
  }
  public void setB(double b) {
    this.b = b;
  }
  public String getC() {
    return c;
  }
  public void setC(String c) {
    this.c = c;
  }
  public int  getD() {
    return d;
  }
  public void setD(char d) {
    this.d = d;
  }
  @Override
  public String toString() {
    return "Emp [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
  }
  
  public Emp(int a, double b, String c, int i) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = i;
  }
  public Emp() {
  }
 
    
  }
 

  

