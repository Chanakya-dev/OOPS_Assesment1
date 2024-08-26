import java.util.Scanner;

public class Test{
// 1)Prepare an Object of Emp() and Initialize a Variable
// 2)Print Values using Getters()
// 3)Prepare an Object of Emp() Initialize it through Args()Constructor
// 4)Print Values by using toString();
  public static void main(String[] args) {
    Emp e= new Emp();
    e.setId(118);
    e.setName("Rahul");
    e.setNum(1234);
    e.setRole("jd");
    System.out.println(e.getId());
    System.out.println(e.getName());
    System.out.println(e.getNum());
    System.out.println(e.getRole());

Emp e1= new Emp(120,"ravi",1423,"kd");
System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getNum()+" "+e1.getRole()+" ");
System.out.println(e1.toString());
  }  
}
