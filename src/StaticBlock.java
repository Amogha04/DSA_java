public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        System.out.println("Hi nigga");
        b = a * 5;
    }

    public static void main(String[] args) {
        System.out.println(a + " " + b);
        b = b + 6;
        System.out.println(a + " " + b);
    }
}
