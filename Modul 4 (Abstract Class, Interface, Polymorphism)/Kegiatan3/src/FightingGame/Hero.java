package Kegiatan3.src.FightingGame;

public abstract class Hero {
    double healthPoint, attackDamage, realDamage, defense;
    int level = 1;
    boolean lifeStatus = true;

    public void attack(String P1_Name, String P2_Name, double P1_attackDamage, double P2_defense, double P2_health){
        System.out.printf("\n=== %s Turn ===\n", P1_Name); spawnIntro();
        reviewDamage(P1_attackDamage, P2_defense);
        setrealDamage(P2_health - getrealDamage());
        if (getrealDamage() <= 0){
            setrealDamage(0);
        }
        System.out.printf("%s HP Remaining\t: %.1f\n", P2_Name, getrealDamage());
    }
    
    public void reviewDamage(double attackDamage, double defense){
        setrealDamage(attackDamage - defense); 
    }
    
    public void checkStatus(String hero){
        System.out.println("\n=== " + hero + " ===\n");
        System.out.printf("Level : %d\n", getlevel());
        System.out.printf("Attack Damage : %.1f\t\t\tLive Status : %b\n", getattackDamage(), getlifStatus());
        System.out.printf("Healt Point : %.1f\t\t\tDefense : %.1f\n", gethealtPoint(), getdefense());
    }
    
    public abstract void spawnIntro(); 

    // setter gatteer
    public void setrealDamage(double realDamage){ 
        this.realDamage = realDamage;
    }

    public double getrealDamage(){ 
        return realDamage;
    }

    public void setattackDamage(double attackDamage){ 
        this.attackDamage = attackDamage;
    }

    public double getattackDamage(){ 
        return attackDamage;
    }

    public void setlifeStatus(boolean lifeStatus){
        this.lifeStatus = lifeStatus;
    }

    public boolean getlifStatus(){ 
        return lifeStatus;
    }

    public void sethealthPoint(double healtPoint){ 
        this.healthPoint = healtPoint;
    }

    public double gethealtPoint(){ 
        return healthPoint;
    }

    public void setdefense (double defense){ 
        this.defense = defense;
    }

    public double getdefense(){ 
        return defense;
    }

    public void setlevel (int level){ 
        this.level = level;
    }

    public int getlevel(){ 
        return level;
    }
}
