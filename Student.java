package assi5;

public class Student {
	String name;
    int age;
    String address;
    public Student() {
        name = "unknown";
        age = 0;
        address = "not available";
    }

    
    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}
