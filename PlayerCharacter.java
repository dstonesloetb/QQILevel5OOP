//Sub class

public class PlayerCharacter extends ComputerCharacter {

    private int experience;

    public PlayerCharacter(String name) {
        super(name, 100, 1);
        this.experience = 0;
    }

    public void gainExperience(int amount) {
        experience += amount;
        if (experience >= 100) {
            levelUp();
            experience = 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Experience: " + experience;
    }
}
