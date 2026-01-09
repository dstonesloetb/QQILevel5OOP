/*
Inheritance → extends
Method overriding → toString()
Polymorphism → enemy attacks a ComputerCharacter
Encapsulation → protected/private access
Code reuse → shared behavior in superclass

*/

public class GameDriver {

    public static void main(String[] args) {

        PlayerCharacter player = new PlayerCharacter("CyberHero");
        EnemyCharacter enemy = new EnemyCharacter("RoboBeast", "Boss", 3);

        enemy.attack(player);
        player.gainExperience(120);

        System.out.println(player);
        System.out.println(enemy);
    }
}
