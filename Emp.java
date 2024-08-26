public class Emp{
// Take 4 Variables of Emp Data With an Access Modifier Private
  // Prepare toString()
    // Private attributes
    private int id;
    private String name;
    private double salary;
    private String department;

    // Parameterized constructor
    public Emp(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    
}

    public Emp() {
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public double getSalary() {
      return salary;
    }

    public void setSalary(double salary) {
      this.salary = salary;
    }

    public String getDepartment() {
      return department;
    }

    public void setDepartment(String department) {
      this.department = department;
    }

    @Override
    public String toString() {
      return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
    }

  }
    

