public class Turtle implements Animals{

  @Override
  public String Eat(String food) {
    // TODO Auto-generated method stub
    return food;
  }
// implements Animal Interface
  // Provide functionality for eat()

  public static void main(String[] args) {
    Turtle t = new Turtle();
    System.out.println(t.Eat("Grass"));

  }

  


}
