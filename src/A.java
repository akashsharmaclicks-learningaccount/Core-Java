public class A {
    public void f( int x) {
        System.out.println("Class A");
    }
}
class B extends A {
    public void f( int x, int y) {
        System.out.println("Class B");
    }
}
class Runner4{
    public static void main(String[] args) {
        B obj = new B();
        obj.f(3);
        obj.f(4, 5);
    }
}
