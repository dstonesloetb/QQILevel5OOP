public class Person {

    // -------------------------
    // Instance variables
    // -------------------------
    private String name;
    private int age;

    // -------------------------
    // Constructors (overloaded)
    // -------------------------

    // No-argument constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with one parameter
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with two parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // -------------------------
    // Getter and Setter methods
    // -------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {   // simple validation
            this.age = age;
        }
    }

    // -------------------------
    // Extra method
    // -------------------------
    public void haveBirthday() {
        age++;
        System.out.println(name + " is now " + age + " years old.");
    }

    // -------------------------
    // toString method
    // -------------------------
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    // -------------------------
    // Main method for testing
    // -------------------------
    public static void main(String[] args) {

        // Testing constructors
        Person p1 = new Person();
        Person p2 = new Person("Alice");
        Person p3 = new Person("Bob", 25);

        // Print initial objects
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Testing setters and getters
        p1.setName("Charlie");
        p1.setAge(30);

        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());

        // Testing extra method
        p3.haveBirthday();

        // Final object states
        System.out.println(p1);
        System.out.println(p3);
    }
}
