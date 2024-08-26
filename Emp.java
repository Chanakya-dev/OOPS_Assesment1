class Emp {
    // Take 4 Variables of Emp Data With an Access Modifier Private
    // Prepare toString()
    private int n;
    private String p;
    private float j;
    private byte s;

    Emp(int n, String p, float j, byte s) {
        this.n = n;
        this.p = p;
        this.j = j;
        this.s = s;
    }

    public String gets() {
        return n + " " + p + " " + j + " " + s;
    }

    public String toString() {
        return "String:" + p + " int:" + n + " float:" + j + " byte:" + s;
    }

}

public class action {
    public static void main(String[] args) {
        Emp em = new Emp(12, "hello", 12.8f, (byte) -123);
        System.out.println(em.gets());
        System.out.println(em);

    }
}
