package fr.elseif;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int salaireAnnuel = 30000;
        int nombreAnneeEemploi = 2;
        System.out.println("Les conditions requises pour avoir un pret :");
        if(salaireAnnuel > 30000 && nombreAnneeEemploi >= 2){
            System.out.println("Le pret est accordé");
        } else {
            System.out.println("Le pret n'est pas accordé");
        }     
    }
    
}
