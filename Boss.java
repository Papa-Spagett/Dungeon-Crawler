/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crawlerv2;
import java.util.ArrayList;
import java.util.Map;
/**
 *
 * @author Big Thomas
 */
public class Boss {
               private final int Hp;
               private final double minDmg;
               private final int maxhp;
               private final int maxdmg;
               private final String name;
             
    public Boss( int Hp, double minDmg , int maxhp , int maxdmg, String name){
        this.Hp = Hp;
        this.minDmg = minDmg;
        this.maxdmg= maxdmg;
        this.maxhp= maxhp;
        this.name= name;
    }
    
}
