public class Turtle implements Animals{

  @Override
  public void Eat(String a) {
 String y=a;
 System.out.println(y);
  }
  public static void main(String[] args) {
    Turtle n=new Turtle();
    n.Eat("eat five star do nothing");
  }

 
}
// implements Animal Interface
  // Provide functionality for eat()
  

