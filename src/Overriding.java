public class Overriding {
     public void fun1(int x){
         System.out.println("Parent Class");
     }
}
class C extends Overriding {
    public void fun1(int x){
        System.out.println("Child Class");
    }
}
class Runner5{
    public static void main(String[] args) {
        Overriding obj = new Overriding();
        C obj1 = new C();
        obj.fun1(3);
        obj1.fun1(5);

    }
}
