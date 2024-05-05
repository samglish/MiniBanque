import java.util.*;
import java.util.Scanner;
Public Class Banque{
    public static void main(String[] args){
        Compte c1=new Compte(100);
        Compte c2=c1.clone();
        System.out.println(c1);
        System.out.println(c2);
        c1.crediter(100);
        System.out.println(c1);
        System.out.println(c2);
    }
}