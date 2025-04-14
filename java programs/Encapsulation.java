class Person {
    
    private String name;
    private int age;

    
    public void setInfo(String n, int a) {
        name = n;
        age = a;
    }

    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();  // Create object
        person.setInfo("Hema Sundar", 19);  // Set data using method
        person.displayInfo();  // Display output
    }
}
