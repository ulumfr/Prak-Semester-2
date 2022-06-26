package Kegiatan3.src.FightingGame;

import java.util.Random;

public class Driver {
    public static void main(String[] args) {

        int round = 0;
        int pickHero1, pickHero2;

        Random r = new Random();
        Assassin a = new Assassin(r.nextInt(15) + 1);
        Tank t = new Tank(r.nextInt(15) + 1);
        Mage m = new Mage(r.nextInt(15) + 1);

        do{
            pickHero1 = r.nextInt(3) + 1;
            pickHero2 = r.nextInt(3) + 1;
            
            if(pickHero1 == 1 && pickHero2 == 2 || pickHero1 == 2 && pickHero2 == 1){
                
                a.checkStatus("Assassin");
                t.checkStatus("Tank");
                System.out.println("\n\n =============== Fight Begin ===============");
               
                do{
                   round++;
                   System.out.printf("=============== Round  %d ===============", round);

                   //Assassin Turn
                   if(a.getlifStatus()){
                       a.attack("Assassin", "Tank", a.getattackDamage(), t.getdefense(), t.gethealtPoint());
                       t.sethealthPoint(a.getrealDamage());

                       if (t.gethealtPoint() <= 0 ){
                           t.setlifeStatus(false);
                       }
                   }

                   //Tank Turn 
                   if(t.getlifStatus()){
                       t.attack("Tank", "Assassin", t.getattackDamage(), a.getdefense(), a.gethealtPoint());
                       a.sethealthPoint(t.getrealDamage());

                       if(a.gethealtPoint() <= 0){
                           a.setlifeStatus(false);
                       }
                   }
                }while(a.getlifStatus() && t.getlifStatus());

                //Result
                System.out.println("\n========= Match Result =========");
                if(!a.getlifStatus() && t.getlifStatus()){
                    System.out.println("Assasin Die, Tank Win YAY");
                } else{
                    System.out.println("Tank Die, Assasin Win YAY");
                }
           }else if(pickHero1 == 1 && pickHero2 == 3 || pickHero1 == 3 && pickHero2 == 1){
                a.checkStatus("Assassin");
                m.checkStatus("Mage");
                System.out.println("\n\n=============== Fight Begins ===============");
                
                do{
                    round++;
                    System.out.printf("=============== Round  %d ===============", round);

                    //Assassin Turn
                    if(a.getlifStatus()){
                        a.attack("Assassin", "Mage", a.getattackDamage(), m.getdefense(), m.gethealtPoint());
                        m.sethealthPoint(a.getrealDamage());

                        if (m.gethealtPoint() <= 0 ){
                            m.setlifeStatus(false);
                        }
                    }

                    //Mage Turn 
                    if(m.getlifStatus()){
                        m.attack("Mage", "Assassin", m.getattackDamage(), a.getdefense(), a.gethealtPoint());
                        a.sethealthPoint(m.getrealDamage());

                        if(a.gethealtPoint() <= 0){
                            a.setlifeStatus(false);
                        }
                    }
                }while(a.getlifStatus() && m.getlifStatus());

                //Result
                System.out.println("\n=============== Match Result ===============");
                if(!a.getlifStatus() && t.getlifStatus()){
                    System.out.println("Assasin Die, Mage Win YAY");
                } else{
                    System.out.println("Mage Die, Assasin Win YAY");
                }
            }else {
                t.checkStatus("Tank");
                m.checkStatus("Mage");
                System.out.println("\n\n=============== Fight Begin ===============");
                
                do{
                    round++;
                    System.out.printf("=============== Round  %d ===============", round);

                    //Tank Turn
                    if(t.getlifStatus()){
                        t.attack("Tank", "Mage", t.getattackDamage(), m.getdefense(), m.gethealtPoint());
                        m.sethealthPoint(t.getrealDamage());

                        if (m.gethealtPoint() <= 0 ){
                            m.setlifeStatus(false);
                        }
                    }

                    //Mage Turn 
                    if(m.getlifStatus()){
                        m.attack("Mage", "Tank", m.getattackDamage(), t.getdefense(), t.gethealtPoint());
                        t.sethealthPoint(m.getrealDamage());

                        if(t.gethealtPoint() <= 0){
                            t.setlifeStatus(false);
                        }
                    }
                }while(t.getlifStatus() && m.getlifStatus());

                //Result
                System.out.println("\n=============== Match Result ===============");
                if(!a.getlifStatus() && t.getlifStatus()){
                    System.out.println("Tank Die, Mage Win YAY");
                } else{
                    System.out.println("Mage Die, Tank Win YAY");
                }
            }
        }while(pickHero1 == pickHero2);
    }
}