// Sub Class

public class EnemyCharacter extends ComputerCharacter {

    private String enemyType;

    public EnemyCharacter(String name, String enemyType, int level) {
        super(name, 100, level);
        this.enemyType = enemyType;
    }

    public void attack(ComputerCharacter target) {
        int damage = getLevel() * 10;
        target.takeDamage(damage);
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Enemy Type: " + enemyType;
    }
}
