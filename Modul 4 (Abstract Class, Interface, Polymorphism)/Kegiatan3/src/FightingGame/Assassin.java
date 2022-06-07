package Kegiatan3.src.FightingGame;

import java.util.Random;

public class Assassin extends Hero implements CriticalDamage{
    public double healthPoint = 3000, defense = 300, attackDamage =  800 + (800 * bonusDamage);
    
    Assassin (int level){
        sethealthPoint(healthPoint);
        setdefense(defense);
        setattackDamage(attackDamage);

        final double B_healthPoint = 90, B_defense = 15, B_attackDamage = 30;
        for (int i = 1; i < level; i++){
            sethealthPoint(gethealtPoint() + B_healthPoint);
            setdefense(getdefense() + B_defense);
            setattackDamage(getattackDamage() + B_attackDamage);
        }setlevel(level);
    }

    @Override
    public void spawnIntro(){
        Random r = new Random();
        String[] voice = {
            "Sir, what your command?",
            "War is not a game",
            "My blade move with the shadow",
            "The shadow will pearch you"
        };
        System.out.println(voice[r.nextInt(voice.length)]);
    }
}
