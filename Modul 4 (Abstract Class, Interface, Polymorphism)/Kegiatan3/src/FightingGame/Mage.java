package FightingGame;

import java.util.Random;

public class Mage extends Hero implements MagicalDamage{
    public double healthPoint = 2500, defense = 200, attackDamage = 700;
    public double B_healthPoint = 85, B_defense = 10, B_attackDamage = 35;
    
    public void spawnIntro(){
        Random r = new Random();
        String[] voice = {
            "Suara Mage",
            "Apa atuh",
            "Enaknya apa",
            "Terakhir deh"
        };
        System.out.println("Mage : " + voice[r.nextInt(voice.length)]);
    }

    public void spawnHero(){
        sethealthPoint(healthPoint);
        setdefense(defense);
        setattackDamage(attackDamage);
    }
    
    public void levelUP(int level){
        setlevel(level);
        if (level > 1){
            sethealthPoint(gethealtPoint() + B_healthPoint * level);
            setdefense(getdefense() + B_defense * level);
            attackDamage += attackDamage * magicDamageBonus;
            setattackDamage(attackDamage);
            setattackDamage(getattackDamage() + B_attackDamage * level);
        }else{
            sethealthPoint(healthPoint);
            setdefense(defense);
            setattackDamage(attackDamage);
        }
        this.attackDamage = getattackDamage();
        this.defense = getdefense();
        this.healthPoint = gethealtPoint();
    }
}
