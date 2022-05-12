public class Warlock extends Character{
    Warlock(String name, int lvl, int hp, int mp){
        super(name,lvl,hp,mp);
    }
    /**
     * Skills and Regen 
     */
    public void puncture(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Puncture (Damage - 10) (Mana cost - 20)");
        int damagePoints = 10;
        int manaCost = 20;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void thornedrose(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Thorned Rose (Damage - 30) (Mana cost - 60)");
        int damagePoints = 30;
        int manaCost = 60;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void phantomexecution(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Phantom Execution (Damage - 60) (Mana cost - 100)");
        int damagePoints = 60;
        int manaCost = 100;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    /**
     * Display character data
     */
    public void display(){
        System.out.println("Warlock: " + super.characterName);
        System.out.println("HealthPoints: " + super.healthPoints);
        System.out.println("ManaPoints: " + super.manaPoints);
        System.out.println("Level " + super.level);
    }
}
