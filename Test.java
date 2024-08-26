import java.util.Scanner;
public class Test{
    public static void main(String[] args) {
        int a;
      String n;
      double b;
        Scanner out=new Scanner(System.in);
        Emp in=new Emp();
System.out.println("enter the id ");
     a=out.nextInt();
     System.out.println("enter the name ");
     n=out.next();
     System.out.println("enter the salary ");
     b=out.nextDouble();
    
        in.setId(a);
        in.setName(n);
        in.setSalary(b);
        System.out.println(in.getId()+"      "+in.getName()+"     "+in.getSalary());



   Emp in2=new Emp(a, n, b);
   System.out.println(a+"   ");
   System.out.println(n+"   ");
   System.out.println(b+"   ");

System.out.println(in2);








// 1)Prepare an Object of Emp() and Initialize a Variable
// 2)Print Values using Getters()
// 3)Prepare an Object of Emp() Initialize it through Args()Constructor
// 4)Print Values by using toString();
  
}
}

