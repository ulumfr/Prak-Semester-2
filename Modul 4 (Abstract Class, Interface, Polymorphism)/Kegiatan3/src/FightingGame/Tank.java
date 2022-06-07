package Kegiatan3.src.FightingGame;

import java.util.Random;

public class Tank extends Hero{

    public double healthPoint = 7000, defense = 500, attackDamage = 500;
    

    Tank(int level){
        sethealthPoint(healthPoint);
        setdefense(defense);
        setattackDamage(attackDamage);

        final double B_healthPoint = 200, B_defense = 15, B_attackDamage = 20;
        for (int i = 0; i < level; i++){
            sethealthPoint(gethealtPoint() + B_healthPoint);
            setdefense(getdefense() + B_defense);
            setattackDamage(getattackDamage() + B_attackDamage);
        }setlevel(level);
    }
    
    @Override
    public void spawnIntro(){
        Random r = new Random();
        String[] voice = {
            "Go on! Sound the horn of victory",
            "I have a hammer to swing",
            "No pain, No gain",
            "Protect the fairy forests, protect my people"
        };
        System.out.println(voice[r.nextInt(voice.length)]);
    }
}
