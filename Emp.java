public class Emp{
// Take 4 Variables of Emp Data With an Access Modifier Private
  // Prepare toString()
  private int age;
  private String name;
  private double salary;
  private char gender;
  
  public Emp(int age, String name, double salary, char gender) {
    this.age = age;
    this.name = name;
    this.salary = salary;
    this.gender = gender;
  }

  public Emp(){
    
  }
  @Override
  public String toString() {
    return "Emp [age=" + age + ", name=" + name + ", salary=" + salary + ", gender=" + gender + "]";
  }
  public static void main(String[] args) {
    Emp oo=new Emp(15,"asta",30000,'m');
    System.out.println(oo.toString());

  }

}
