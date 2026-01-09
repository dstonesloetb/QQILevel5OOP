/*

Concepts Demonstrated
Encapsulation → private variables + public getters/setters
Constructor overloading → multiple ways to create objects
Method behavior → game-like actions (takeDamage, heal, levelUp)
Polished output → overridden toString()
Super Class (or base class)

*/

public class ComputerCharacter {

    // ===== Instance Variables =====
    private String name;
    private int health;
    private int level;
    private boolean isAlive;

    // ===== Constructors =====

    // Default constructor
    public ComputerCharacter() {
        this.name = "Unknown";
        this.health = 100;
        this.level = 1;
        this.isAlive = true;
    }

    // Overloaded constructor
    public ComputerCharacter(String name, int level) {
        this.name = name;
        this.level = level;
        this.health = 100;
        this.isAlive = true;
    }

    // Overloaded constructor with all fields
    public ComputerCharacter(String name, int health, int level, boolean isAlive) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.isAlive = isAlive;
    }

    // ===== Getters and Setters =====

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        if (this.health <= 0) {
            this.health = 0;
            this.isAlive = false;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level > 0) {
            this.level = level;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    // ===== Other Methods =====

    public void takeDamage(int damage) {
        if (isAlive) {
            setHealth(this.health - damage);
            System.out.println(name + " takes " + damage + " damage.");
        }
    }

    public void heal(int amount) {
        if (isAlive) {
            this.health += amount;
            System.out.println(name + " heals " + amount + " health.");
        }
    }

    public void levelUp() {
        level++;
        health = 100;
        System.out.println(name + " leveled up to level " + level + "!");
    }

    // ===== toString Method =====

    @Override
    public String toString() {
        return "ComputerCharacter {" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", level=" + level +
                ", isAlive=" + isAlive +
                '}';
    }

    // ===== Main Method =====

    public static void main(String[] args) {

        // Create character using default constructor
        ComputerCharacter character1 = new ComputerCharacter();

        // Create character using overloaded constructor
        ComputerCharacter character2 = new ComputerCharacter("RoboKnight", 5);

        // Use setters
        character1.setName("CyberMage");
        character1.setLevel(3);

        // Call methods
        character2.takeDamage(30);
        character2.heal(20);
        character2.levelUp();

        // Print characters
        System.out.println(character1);
        System.out.println(character2);
    }
}
