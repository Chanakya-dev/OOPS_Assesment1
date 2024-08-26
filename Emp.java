public class Emp {
  // Private fields for encapsulation
  private int id;
  private String name;
  private double salary;
  private long phone;

  // Constructor with all parameters
  public Emp(int id, String name, double salary, long phone) {
      this.id = id;
      this.name = name;
      this.salary = salary;
      this.phone = phone;
  }

  // Default constructor
  public Emp() {
  }

  // Getter and Setter methods for field 'id'
  public int getId() {
      return id;
  }

  public void setId(int id) {
      this.id = id;
  }

  // Getter and Setter methods for field 'name'
  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  // Getter and Setter methods for field 'salary'
  public double getSalary() {
      return salary;
  }

  public void setSalary(double salary) {
      this.salary = salary;
  }

  // Getter and Setter methods for field 'phone'
  public long getPhone() {
      return phone;
  }

  public void setPhone(long phone) {
      this.phone = phone;
  }

  // Overriding toString() method to provide a string representation of the object
  @Override
  public String toString() {
      return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", phone=" + phone + "]";
  }
}
