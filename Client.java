
import java.io.IOException;

import java.net.*;
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
public class Client {
     public static void main(String args[]) throws IOException{
      DatagramSocket sc = new DatagramSocket();
      Scanner scan = new Scanner(System.in);
  
      System.out.println("Please Type your greeting:  ");
      String greeting = scan.nextLine();
      InetAddress ip = InetAddress.getByName("131.118.66.187");
      
      DatagramPacket pkt = new DatagramPacket(greeting.getBytes(),greeting.length(),ip,58778);
      sc.send(pkt);
      sc.close();
}
}
