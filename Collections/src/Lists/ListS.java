/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lists;
import java.util.*;

/**
 *
 * @author anggarasaputra
 */
public class ListS {
    public static void main(String args[]){
        ArrayList<String> comList = new ArrayList<String>();
        
        comList.add("First");
        comList.add("Second");
        comList.add("Third");
        
        System.out.println(comList.get(1));
        
        comList.add(1, "Fourth");
        
        System.out.println(comList.get(1));
        System.out.println(comList.get(2));
        
        comList.remove(2);
        
        System.out.println(comList);
    }
    
}
