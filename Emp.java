import java.util.Scanner;

public class Emp{
// Take 4 Variables of Emp Data With an Access Modifier Private
  // Prepare toString()
  private int Eid;
  private String Ename;
  private long EmobNo;
  private double Esalary;

  public void  SetEid(int Eid){
    this.Eid = Eid;
  }

  public int GetEid(){
    return Eid;
  }

  public void SetEname(String Ename){
    this.Ename = Ename;
  }
  public String GetEname(){
    return Ename;
  }

  public void SetEmobNo(int EmobNo){
    this.EmobNo = EmobNo;
  }
  public Long GetEmobNo(){
    return EmobNo;
  }


  public void SetEsalary(double Esalary){
    this.Esalary = Esalary;
  }
  public double GetEsalary(){
    return Esalary;
  }

  public Emp(){
    
  }

  public Emp(int eid, String ename) {
    this.Eid = eid;
    this.Ename = ename;
  }

  @Override
  public String toString() {
    return "Emp [EmobNo=" + EmobNo + ", Esalary=" + Esalary + "]";
  }




 

  
}
