package fr.cremecafe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bonjour ! Je suis l'assistant de la machine à café. Dites-moi les Pièce jaunes dont vous disposez : ");

        Scanner clavier = new Scanner(System.in);

        // Nombre de piece Jaune a 1 centime
        System.out.print("pièces de 1 cent ? ");
        int pieces1 = clavier.nextInt();

        // Nombre de piece Jaune a 5 centime
        System.out.print("pièces de 5 cents ? ");
        int pieces5 = clavier.nextInt();

        // Nombre de piece Jaune a 10 centime
        System.out.print("pièces de 10 cents ? ");
        int pieces10 = clavier.nextInt();

        // Nombre de piece Jaune a 20 centime
        System.out.print("pièces de 20 cents ? ");
        int pieces20 = clavier.nextInt();

        // Nombre de piece Jaune a 50 centime
        System.out.print("pièces de 50 cents ? ");
        int pieces50 = clavier.nextInt();

        // Calcule du Total de piéce
        int total = (pieces1 * 1) + (pieces5 * 5) + (pieces10 * 10) + (pieces20 * 20) + (pieces50 * 50);

        // Je calcule pour savoir si le total et égale ou supérieur a 100
        if(total >= 100) {

            System.out.println("Vous avez exactement de quoi vous payer un café-crème.");

            // Je calcule le surplus de cents pour manquer le restant après l'achat du café
            if(total > 100) {

                System.out.println("il vous restera " + (total - 100) + " cents après avoir pris votre café !");

            }

            // Je calcule si le total et inférieurs a 100 et envoie une message pour mettre la somme manquante pour l'achat d'un
        }else if(total < 100) {

            System.out.println("Il vous manque "+ (100-total) + " cents pour prendre un café.");

        }


      
    }
}