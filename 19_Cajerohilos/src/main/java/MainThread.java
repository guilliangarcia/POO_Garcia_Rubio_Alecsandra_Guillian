/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tosh
 */
public class MainThread {
    
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("Cliente Michael", new int[]{2,2,1,5,2});
        Cliente cliente2 = new Cliente("Cliente Mario", new int[]{2,1,1,5,1});
        Cliente cliente3 = new Cliente("Cliente Diana", new int[]{8,1,7,7,3});
        
        
        long inicialTime = System.currentTimeMillis();
        
        
        Cajerahilo cajero1 = new Cajerahilo("Cajero Cesar", cliente1, inicialTime);
        Cajerahilo cajero2 = new Cajerahilo("Cajero Dionisio", cliente2, inicialTime);
        Cajerahilo cajero3 = new Cajerahilo("Cajera Pancha", cliente2, inicialTime);
        
        cajero1.start();
        cajero2.start();
        cajero3.start();
    }
}