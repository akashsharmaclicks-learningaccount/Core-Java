public class Box
{
    private int length, breadth, height;
    public void setDimensions(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }
    public void showDimensions() {
        System.out.println("Length: " + length + ", Breadth: " + breadth + ", Height: " + height);
    }
    public float showArea(){
        float area = length * breadth * height;
        return area;
    }
}
class  Runner
{
    public static void main(String[] args)
    {
        Box smallBox = new Box();
        smallBox.setDimensions(10, 20, 25);
        smallBox.showDimensions();
        System.out.println("Area of Box : "+smallBox.showArea());

    }
}
