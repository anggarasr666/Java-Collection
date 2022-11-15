/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;
import java.util.LinkedList;
import java.util.Queue;


/**
 *
 * @author anggarasaputra
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Integer> comQ = new LinkedList<>();
        
        comQ.add(1);
        comQ.add(2);
        comQ.add(3);
        
        System.out.println(comQ);
        
        System.out.println(comQ.peek());
        
        System.out.println(comQ.size());
        
    }
    
}
