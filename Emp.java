public class Emp {
// Take 4 Variables of Emp Data With an Access Modifier Private
  // Prepare toString()
  private int age;
  private String name;
  private int num;
  private int rank;
  public Emp (int age , String name , int num , int i ){
    this.age=age;
    this.name=name;
    this.num=num;
    this.rank=i;

  }
  public Emp(){}
  @Override
  public String toString() {
    return "Emp [age=" + age + ", name=" + name + ", num=" + num + ", rank=" + rank + "]";
  }
  
  public static void main(String[] args) {
    Emp li=new Emp(25,"mouni",30,1);
    System.out.println(li.toString());

  }
  
}
