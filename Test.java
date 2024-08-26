public class Test{
// 1)Prepare an Object of Emp() and Initialize a Variable
// 2)Print Values using Getters()
// 3)Prepare an Object of Emp() Initialize it through Args()Constructor
// 4)Print Values by using toString();
Emp li =new Emp();



public Emp getLi() {
    return li;
}

Emp ms=new Emp(30,"mouni",100,1);
@Override
public String toString() {
    return "Test [li=" + li + ", ms=" + ms + "]";
}
public static void main(String[] args) {
    Emp ms=new Emp(30,"mouni",100,1);
    System.out.println(ms.toString());
}
  
}
