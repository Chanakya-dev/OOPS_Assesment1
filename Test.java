public class Test{
public static void main(String[] args) {
    Emp e=new Emp(1,"Revathi",50000,'F');
    System.out.println("Emp Id : "+e.getEid());
    System.out.println("Emp Name : "+e.getEname());
    System.out.println("Emp Salary : "+e.getSal());
    System.out.println("Emp Gender : "+e.getGen());
    System.out.println("using tostring---");
    System.out.println(e.toString());
}
}
