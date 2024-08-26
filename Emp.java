public class Emp{
  private int U;
  private int y;
  private String o;
  private int c;

  public int getU() {
    return U;
  }
  public void setU(int u) {
    U = u;
  }
  public int getY() {
    return y;
  }
  public void setY(int y) {
    this.y = y;
  }
  public String getO() {
    return o;
  }
  public void setO(String o) {
    this.o = o;
  }
  public int getC() {
    return c;
  }
  public void setC(int c) {
    this.c = c;
  }
  @Override
  public String toString() {
    return "Emp [U=" + U + ", y=" + y + ", o=" + o + ", c=" + c + "]";
  }
  public Emp(int u, int y, String o, int c) {
    U = u;
    this.y = y;
    this.o = o;
    this.c = c;
  }
public Emp() {
}
 
  
}
// Take 4 Variables of Emp Data With an Access Modifier Private
  // Prepare toString()