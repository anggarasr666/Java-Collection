/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CompareTo;
import java.util.*;
import java.io.*;

/**
 *
 * @author anggarasaputra
 */
public class compareTo {
    public static void main(String[]args) {
        ArrayList<String> A = new ArrayList<>(Arrays.asList("1", "2", "3"));
        
        ArrayList<String> B = new ArrayList<>(Arrays.asList("2", "1", "3"));
        
        boolean Comparet = A.equals(B);
        
        System.out.println(Comparet);
    }
}
