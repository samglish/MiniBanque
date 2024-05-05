/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Test to edit this template
 */
package Launch;

/**
 *
 * @author samglish
 */
import classes.Compte;
public class Test {
     public static void main(String[] args){
        Compte c1=new Compte(100);
         System.out.println("Votre compte a été crée, votre "+c1.toString());
        c1.crediter(100);
        c1.debiter(50);
         System.out.println(c1.toString());
    }
}
