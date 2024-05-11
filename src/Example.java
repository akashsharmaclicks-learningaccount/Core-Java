// Instance Member: Instance members belong to the class object and are called using object pointer name of the class.
// Static Member: Static members belong to the class and are called using class name directly.
public class Example {
    int x = 5; // Instance member variable;
    static  int y ; // Static member variable

    // Instance member function
    public void fun1(){
        System.out.println("I am instance member function:  fun1()");
    }

    // Static member function
    public static void fun2(){
        y = 6;
        System.out.println("I am static member function : fun2(), And I updated the value of static variable y : "+y);

    }

    // Static member class
    static class Nation{
        public static String country = "India";
    }
}
class Runner1{
    public static void main(String[] args) {
    Example example_obj = new Example();
        System.out.println("Value of instance variable x is : " + example_obj.x);
        System.out.println("Value of static variable y is : " + Example.y);
        example_obj.fun1();
        Example.fun2();
        System.out.println("I am static class Nation : "+Example.Nation.country);
    }
}
