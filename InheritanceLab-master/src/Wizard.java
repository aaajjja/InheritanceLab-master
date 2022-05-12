public class Wizard extends Character{
    Wizard(String name, int lvl, int hp, int mp){
        super(name,lvl,hp,mp);
    }
    public void maleficbomb(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Malefic Bomb (Damage - 10)(Mana Cost - 30)");
        int damagePoints = 10;
        int manaCost = 30;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void voidprojectile(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Void Projectile (Damage - 20)(Mana Cost - 60)");
        int damagePoints = 20;
        int manaCost = 60;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void destructionrush(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Destruction Rush (Damage - 70)(Mana Cost - 110)");
        int damagePoints = 70;
        int manaCost = 110;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void regen(){
        super.healthPoints += 50;
        System.out.println("Heal Me Baby!!!");
    }
    /**
     * Display character data
     */
    public void display(){
        System.out.println("Wizard: " + super.characterName);
        System.out.println("HealthPoints: " + super.healthPoints);
        System.out.println("ManaPoints: " + super.manaPoints);
        System.out.println("Level " + super.level);
    }
}
