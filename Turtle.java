public class Turtle implements Animals{
  public void Eat(String name, String place) {
    String sname = name +place ;
    System.out.println(sname);
  }


  public static void main(String[] args) {
    Turtle ok=new Turtle();
    ok.Eat("fox","africa");
  }
// implements Animal Interface
  // Provide functionality for eat()
}
