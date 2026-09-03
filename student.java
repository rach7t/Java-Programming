
//wap in java to store student data and visualize the name in sorted order on roll no , age , height 
public class student {
    private String name;
    private int rollNo;
    private int age;
    private double height;

    public student(String name, int rollNo, int age, double height) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.height = height;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
// number of students is equal to n which is user input 
// student {name, age ,roll no. , height} is also user input