public class Turtle implements Animals{
    @Override
    public void Eat(String food){
        System.out.println(food);
        
    }
    public static void main(String[] args) {
        Turtle dog = new Turtle();
        dog.Eat("biscuit");
    }
 
}