package Classes;


import java.util.Random;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Big Thomas
 */
public class Player {
   
               int minHp = 100 ;
               int minDmg= 30;
               private final String name;
               Random rand = new Random();
               int maxhp = 150;
               int maxdmg = 40;
             Scanner in = new Scanner(System.in);
             
    public Player( int Hp, int mindmg , int maxhp , int maxdmg, String name){
        this.minHp = Hp;
        this.minDmg = mindmg;
        this.maxdmg= maxdmg;
        this.maxhp= maxhp;
        this.name= name;
        
         int playerhp = rand.nextInt(maxhp-minHp) + minHp;
        int playerdmg = rand.nextInt(maxdmg - minDmg) + minDmg;
        
        
    }

    Player() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    public int playerattack(){
        return (int) (rand.nextInt((int) (maxdmg - minDmg + 1))+ minDmg);
    }

   
    

}

