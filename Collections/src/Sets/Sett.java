/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sets;
import java.util.*;


/**
 *
 * @author anggarasaputra
 */
public class Sett {
    public static void main(String[] args){
        Set<String> comSet = new HashSet<String>();
        
        comSet.add("First");
        comSet.add("Second");
        comSet.add("Third");
        comSet.add("Third");
        
        System.out.println(comSet);
        
        while(!comSet.isEmpty()){
            System.out.println(comSet.contains("First"));
            System.out.println(comSet.contains("Second"));
        }
    }
}
