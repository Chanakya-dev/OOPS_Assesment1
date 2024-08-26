interface Animals {
    // Prepare a Functoin called Eat() with String Paramater
    public String eat(String a, String b);
}

class tiger implements Animals {

    public String eat(String a, String b) {
        return a + b;
    }
}

public class action {
    public static void main(String[] args) {
        tiger ts = new tiger();
        String n = ts.eat("meat", "chicken");
        System.out.println(n);
    }
}
