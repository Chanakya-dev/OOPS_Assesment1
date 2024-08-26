public class Emp{
  private int eid;
  private String ename;
  private double sal;
  private char gen;

  public Emp(int eid, String ename, double sal, char gen) {
    this.eid = eid;
    this.ename = ename;
    this.sal = sal;
    this.gen = gen;
  }
  public int getEid() {
    return eid;
  }

  public String getEname() {
    return ename;
  }

  public double getSal() {
    return sal;
  }

  public char getGen() {
    return gen;
  }
@Override
  public String toString() {
    return "Emp [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", gen=" + gen + "]";
  }
}