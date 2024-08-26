
public class Turtle implements Animals {

  @Override
  public void Eat(String eating) {
      
      System.out.println("The turtle eat a lot : " + eating);
  }

 
  public static void main(String[] args) {
      
      Turtle ss = new Turtle();

      
      ss.Eat("due to that it became poor and became home less");
  }
}
