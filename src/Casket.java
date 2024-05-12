public class Casket {
    private int Length, Width, Height;
    public Casket(){
        Length = 10;
        Width = 8;
        Height = 5;
        System.out.println("Area of Casket : "+Length*Width*Height);
    }

    public Casket(int l, int w, int h){
        Length = l;
        Width = w;
        Height = h;
        System.out.println("Area of Casket : "+Length*Width*Height);
    }

    public static void main(String[] args) {
        Casket obj1 = new Casket();
        Casket obj2 = new Casket(15,15,15);
    }
}
