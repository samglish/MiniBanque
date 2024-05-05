package classes;
import java.util.*;
public class Compte {
    public double solde;
    public Compte(double s){
        this.solde=s;
    }
    public void crediter(double c){
        this.solde+=c;
    }
    public void debiter(double d){
        this.solde-=d;
    }
    public double getSolde(){
        return this.solde;
    }
    public String toString(){
        return "Solde : "+this.solde+" FCFA";
    }
}
