public class Instance_Initialization_Block {
    private int x;
    {
        System.out.println("Initialization Block: x = " + x);
        x=5;
    }
    public Instance_Initialization_Block() {
        System.out.println("Constructor: x = " + x);
    }

    public static void main(String[] args) {
        Instance_Initialization_Block obj = new Instance_Initialization_Block();
        Instance_Initialization_Block obj1 = new Instance_Initialization_Block();

    }
}
