public class Turtle implements Animals{

  @Override
  public void Eat(String a) {
    String x=a;
  System.out.println(x);

  }
  public static void main(String[] args) {
    Turtle h=new Turtle();
    h.Eat("rabbit");
    }


}
// implements Animal Interface
  // Provide functionality for eat()
