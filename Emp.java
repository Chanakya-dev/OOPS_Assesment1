public class Emp{
private String name = "ssr";
private int empid = 121;
private double per = 56.3;
private char gender = 'M';
@Override
public String toString() {
  return "Emp [name=" + name + ", empid=" + empid + ", per=" + per + ", gender=" + gender + "]";
}
public String getName() {
  return name;
}
public void setName(String name) {
  this.name = name;
}
public int getEmpid() {
  return empid;
}
public void setEmpid(int empid) {
  this.empid = empid;
}
public Emp(double per, char gender) {
  this.per = per;
  this.gender = gender;
  System.out.println(per+" "+gender);
}
 public Emp(){

 }

  
}
