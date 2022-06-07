package FightingGame;

import java.util.Random;

public class Tank extends Hero{
    public double healthPoint = 7000, defense = 500, attackDamage = 500;
    public double B_healthPoint = 200, B_defense = 15, B_attackDamage = 20;
    
    public void spawnIntro(){
        Random r = new Random();
        String[] voice = {
            "Suara Tank",
            "Apa atuh",
            "Enaknya apa",
            "Terakhir deh"
        };
        System.out.println("Tank : " + voice[r.nextInt(voice.length)]);
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
