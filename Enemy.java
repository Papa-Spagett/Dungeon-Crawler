package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Big Thomas
 */
public class Enemy {
                int minHp = 15 ;
               int minDmg= 10;
             Scanner in = new Scanner(System.in);
               Random rand = new Random();
               int maxhp = 50;
               int maxdmg = 40;
              String[] names = {"Gallo Goblin", "Tortellini Troll", " Ravioli Rouge", "Wet Noodle Wizard"};
             
    public Enemy( int Hp, int mindmg , int maxhp , int maxdmg, String[] names){
        this.minHp = Hp;
        this.minDmg = mindmg;
        this.maxdmg= maxdmg;
        this.maxhp= maxhp;
        
        
         int enemyhp = rand.nextInt(maxhp-minHp) + minHp;
        int enemydmg = rand.nextInt(maxdmg - minDmg) + minDmg;
        String[] name = names[rand.nextInt(names.length)];
        System.out.println("\t| " + Arrays.toString(name) + " has shown up! |\n");
        
    }

    Enemy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    public int enemyattack(){
        return (int) (rand.nextInt((int) (maxdmg - minDmg + 1))+ minDmg);
    }

   
    

}