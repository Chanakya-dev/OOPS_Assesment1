public class Emp{
// Take 4 Variables of Emp Data With an Access Modifier Private
  // Prepare toString()
  private int id;
  private String name;
  private int num;
  private String role;
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
  public int getNum() {
    return num;
  }
  public void setNum(int num) {
    this.num = num;
  }
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }
  public Emp(int id, String name, int num, String role) {
    this.id = id;
    this.name = name;
    this.num = num;
    this.role = role;
  }
  public Emp() {
  }
  @Override
  public String toString() {
    return "Emp [id=" + id + ", name=" + name + ", num=" + num + ", role=" + role + "]";
  }
  
  
}
