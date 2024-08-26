public class Test{
// 1)Prepare an Object of Emp() and Initialize a Variable
// 2)Print Values using Getters()
// 3)Prepare an Object of Emp() Initialize it through Args()Constructor
// 4)Print Values by using toString();
public static void main(String[] args) {
    Emp t=new Emp();
    t.setA(1);
    t.setB(200);
    t.setC("musu");
    
    t.setD('F');
    System.out.println(t.getA()+"  "+t.getB()+"  "+t.getC()+"  "+t.getD());


    Emp n=new Emp(0, 0, 1+""+200+""+"buuu"+""+'f', 0);
    System.out.println(n);
} 
}
