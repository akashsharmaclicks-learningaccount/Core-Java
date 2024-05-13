public class Person {
    private String name;
    private int age;
    public void setName(String a){
        name = a;
    }
    public void setAge(int b){
        age = b;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
class Student extends Person {
    private int roll_no;
    private String college;
    public void setRoll_no(int r){
        roll_no = r;
    }
    public void setCollege(String c){
        college = c;
    }
    public int getRoll_no(){
        return roll_no;
    }
    public  String getCollege(){
        return college;
    }
}
class runner2{
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setRoll_no(201599003);
        obj.setCollege("Harvard University");
        obj.setAge(23);
        obj.setName("John Doe");
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Roll No: " + obj.getRoll_no());
        System.out.println("College: " + obj.getCollege());
    }
}