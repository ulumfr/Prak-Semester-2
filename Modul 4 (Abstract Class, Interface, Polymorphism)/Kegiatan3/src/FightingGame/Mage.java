package Kegiatan3.src.FightingGame;

import java.util.Random;

public class Mage extends Hero implements MagicalDamage{

    public double healthPoint = 2500, defense = 200, attackDamage = 700 + (700 * magicDamageBonus);
    
    Mage(int level){
        sethealthPoint(healthPoint);
        setdefense(defense);
        setattackDamage(attackDamage);

        final double B_healthPoint = 85, B_defense = 10, B_attackDamage = 35;
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
            "Hey, don't touch the hair!",
            "I'm willing to sacrifice myself, for this world I love",
            "Stop. And listen to my graceful songs",
            "Hahaha… Feel the heat of the inferno!"
        };
        System.out.println(voice[r.nextInt(voice.length)]);
    }
}
