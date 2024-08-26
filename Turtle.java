public class Turtle implements Animals{
  @Override
  public void eat(String food) {
    System.out.println("Animals Eating : "+food);
  }
  public static void main(String[] args) {
    Turtle t=new Turtle();
    t.eat("Grass");
  };
}