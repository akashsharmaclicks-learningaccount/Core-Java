public class Static_Initialization_Block {
    private static int k;
    static{
        System.out.println("Static_Initialization_Block: k="+k );
        k=10;
    }
    public static void main(String[] args) {
    new Static_Initialization_Block();
    }
}
