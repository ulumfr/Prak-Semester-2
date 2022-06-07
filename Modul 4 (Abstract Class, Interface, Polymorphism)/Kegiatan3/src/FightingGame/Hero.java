package FightingGame;

public abstract class Hero {
    private double healthPoint, attackDamage, realDamage, defense, damageTaken;
    private int level = 1;
    private boolean lifeStatus = true;

    public void attack(
        String P1_Name, String P2_Name, 
        
        double P1_attackDamage, double P2_defense, 
        
        double P2_health){

            System.out.printf("\n=== %s Turn ===\n", P1_Name);
            spawnIntro();
            reviewDamage(P1_attackDamage, P2_defense);
            setdamageTaken(P2_health - getrealDamage());
            if (getdamageTaken() <= 0){
                setdamageTaken(0);
            }
            System.out.printf("%s Real Damage\t: %.1f\n", P1_Name, getrealDamage());
            System.out.printf("%s HP Remaining\t: %.1f\n", P2_Name, getdamageTaken());

        }
    
    public void reviewDamage(double attackDamage, double defense){
        setrealDamage(attackDamage - defense); 
    }
    
    public void checkStatus(int levels,String hero){
        System.out.println("===" + hero + "===");
        System.out.println("Level : " + levels);
        System.out.printf("Attack Damage : %.1f\t\t\tDefense : %.1f\n", getattackDamage(), getdefense());
        System.out.printf("Healt Point : %.1f\t\t\tLive Status : %b\n", gethealtPoint(), getstats());
    }
    
    public abstract void spawnIntro(); 
    public abstract void spawnHero();
    public abstract void levelUP(int level);

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

    public boolean getstats(){ 
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

    public void setdamageTaken(double damageTaken) {
        this.damageTaken = damageTaken;
    }

    public double getdamageTaken() {
        return damageTaken;
    }

}
