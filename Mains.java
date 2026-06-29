interface Greeeting{
    void sayHello();
}
public class Mains{
    public static void main(String[] args) {
        Greeeting g = () -> System.out.println("Hello");
        g.sayHello();
    }
}