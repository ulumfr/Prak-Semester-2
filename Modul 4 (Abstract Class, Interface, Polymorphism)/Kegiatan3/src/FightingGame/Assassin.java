package FightingGame;

import java.util.Random;

public class Assassin extends Hero implements CriticalDamage{
    public double healthPoint = 3000, defense = 300, attackDamage = 800;
    public double B_healthPoint = 90, B_defense = 15, B_attackDamage = 30;
    
    public void spawnIntro(){
        Random r = new Random();
        String[] voice = {
            "Suara Assasin",
            "Apa atuh",
            "Enaknya apa",
            "Terakhir deh"
        };
        System.out.println("Assassin : " + voice[r.nextInt(voice.length)]);
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
            attackDamage += attackDamage * bonusDamage;
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
