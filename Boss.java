package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Big Thomas
 */
public class Boss {
               int minHp = 200 ;
               int minDmg= 30;
               private final String name;
               Random rand = new Random();
               int maxhp = 250;
               int maxdmg = 40;
               Scanner in = new Scanner(System.in);
    public Boss( int Hp, int minDmg , int maxhp , int maxdmg, String name){
        this.minHp = Hp;
        this.minDmg = minDmg;
        this.maxdmg= maxdmg;
        this.maxhp= maxhp;
        this.name= name;
        
        
    int bosshp = rand.nextInt(maxhp-minHp) + minHp;
    int bossdmg = rand.nextInt(maxdmg - minDmg) + minDmg;
    }
 public int bossattack(){
        return (int) (rand.nextInt((int) (maxdmg - minDmg + 1))+ minDmg);
    }
    Boss() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

   
      
    
    
