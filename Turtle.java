public class Turtle implements Animals {

  @Override
  public void Eat(String name, String ree) {
    String mname = name + ree;
    System.out.println(mname);
  }
  public static void main(String[] args) {
    Turtle ms=new Turtle();
    ms.Eat("mount", "sho");
  }

// implements Animal Interface
  // Provide functionality for eat()
}
