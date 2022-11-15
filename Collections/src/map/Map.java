/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package map;
import java.util.*;

/**
 *
 * @author anggarasaputra
 */
public class Map {
    public static void main(String[]args){
       HashMap<Integer, String> comMap = new HashMap<>();
       
       comMap.put(1, "First");
       comMap.put(2, "Fourth");
       comMap.put(3, "Fifth");
       
       HashMap.Entry<Integer,String> pair = comMap.entrySet().iterator().next();
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
       
       
    }
}
