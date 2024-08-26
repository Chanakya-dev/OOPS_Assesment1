
// implements Animal Interface
  // Provide functionality for eat()
  // Constructor to initialize the name of the turtle
  public class Turtle implements Animals {
    public String name;

    public Turtle(String name) {
        this.name = name;
    }

    @Override
    public  void eat(String food) {
        System.out.println(name + " the turtle is eating " + food + ".");
    }

public static void main(String[] args){
    Turtle t=new Turtle("Turtle");
    t.eat("lettuce");



}
  }