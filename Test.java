import java.util.Scanner;

public class Test{
// 1)Prepare an Object of Emp() and Initialize a Variable
// 2)Print Values using Getters()
// 3)Prepare an Object of Emp() Initialize it through Args()Constructor
// 4)Print Values by using toString();

public static void main(String[] args) {
    Emp E = new Emp();
    Emp E1 = new Emp(2, "Animal");
    

    E.SetEid(1);
    System.out.println(E.GetEid());

    E.SetEname("Aparna");
    System.out.println(E.GetEname());

    E.SetEmobNo(987654321);
    System.out.println(E.GetEmobNo());

    E.SetEsalary(35000.1547);
    System.out.println(E.GetEsalary());


    System.out.println(E1.GetEid()+ "  "+ E1.GetEname());
    System.out.println(E.toString());

  }
  
}
