class GameCharacter {

    String characterName;

    GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    void performAttack() {
        System.out.println("Attack");
    }
}

class Warrior extends GameCharacter {

    Warrior(String name) {
        super(name);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Sword");
    }
}

class Mage extends GameCharacter {

    Mage(String name) {
        super(name);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Magic");
    }
}

class Archer extends GameCharacter {

    Archer(String name) {
        super(name);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Arrow");
    }
}

public class GameDemo {

    static void startBattle(GameCharacter[] characters) {

        int warrior = 0;
        int mage = 0;
        int archer = 0;

        for (GameCharacter c : characters) {

            c.performAttack();

            if (c instanceof Warrior)
                warrior++;

            else if (c instanceof Mage)
                mage++;

            else if (c instanceof Archer)
                archer++;
        }

        System.out.println("\nWarriors = " + warrior);
        System.out.println("Mages = " + mage);
        System.out.println("Archers = " + archer);
    }

    public static void main(String[] args) {

        GameCharacter[] arr = {
                new Warrior("Shobhit"),
                new Mage("Aman"),
                new Archer("Rahul"),
                new Warrior("Rohan")
        };

        startBattle(arr);
    }
}