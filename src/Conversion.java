import java.sql.SQLOutput;

public class Conversion
{
    public static void main(String[] args){
        // Widening Conversion(Smaller -> Bigger)
        System.out.println("Widening Conversion(Smaller -> Bigger)");
        int x = 3;
        System.out.println("Value of x before conversion is : " + x);
        float y = x;
        System.out.println("Value of x after conversion is : " + y);

        // Narrowing Conversion(Bigger -> Smaller)
        System.out.println("Narrowing Conversion(Bigger -> Smaller)");
        float a = 4.5f;
        System.out.println("Value of a before conversion is : " + a);
        int b = (int) a;
        System.out.println("Value of a after conversion is : " + b);

    }
}
