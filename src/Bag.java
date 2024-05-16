public class Bag {

    private int p1, p2, p3;
    public void pocketValue(int p1, int p2, int p3 ){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public void returnPocketValue(){
        System.out.println("Pocket 1: " + this.p1);
        System.out.println("Pocket 2: " + this.p2);
        System.out.println("Pocket 3: " + this.p3);
    }
    public static void main(String[] args) {
    Bag obj = new Bag();
    obj.pocketValue(10, 20, 30);
    obj.returnPocketValue();
    }
}
