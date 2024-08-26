import java.util.Scanner;

public class Emp{
// Take 4 Variables of Emp Data With an Access Modifier Private
  // Prepare toString()
  private int Eid;
  private String Ename;
  private long EmobNo;
  private double Esalary;
  @Override
  public String toString() {
    return "Emp [Eid=" + Eid + ", Ename=" + Ename + ", EmobNo=" + EmobNo + ", Esalary=" + Esalary + "]";
  }

  public static void main(String[] args) {
    Emp E = new Emp();
    Scanner sc = new Scanner(System.in);
    E.Eid = sc.nextInt();
    E.Ename = sc.next();
    E.EmobNo = sc.nextLong();
    E.Esalary = sc.nextDouble();

    System.out.println(E.toString());
  }

  
}
