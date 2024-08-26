import java.util.Scanner;

public class Test{
// 1)Prepare an Object of Emp() and Initialize a Variable
// 2)Print Values using Getters()
// 3)Prepare an Object of Emp() Initialize it through Args()Constructor
// 4)Print Values by using toString();

public static void main(String[] args) {
    Emp E = new Emp();
    Scanner sc = new Scanner(System.in);
    E.Eid = sc.nextInt();
    E.Ename = sc.next();
    E.EmobNo = sc.nextLong();
    E.Esalary = sc.nextDouble();    
  }
  
}
