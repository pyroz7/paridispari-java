package pariOdispari.org;

import java.util.Random;
import java.util.Scanner;

public class ParioDispari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // Chiedi all'utente di scegliere pari o dispari
        System.out.print("Scegli pari o dispari: ");
        String sceltaUtente = scan.next().toLowerCase();

        // Verifica che l'utente abbia inserito una scelta valida
        if (!sceltaUtente.equals("pari") && !sceltaUtente.equals("dispari")) {
            System.out.println("Scelta non valida. Devi scegliere tra pari e dispari.");
            return;
        }

        // Chiedi all'utente di inserire un numero compreso tra 0 e 5
        System.out.print("Inserisci un numero compreso tra 0 e 5: ");
        int numeroUtente = scan.nextInt();

        // Verifica che il numero inserito dall'utente sia valido
        if (numeroUtente < 0 || numeroUtente > 5) {
            System.out.println("Numero non valido. Deve essere compreso tra 0 e 5.");
            return;
        }

        // Genera un numero casuale per il computer
        int numeroComputer = random.nextInt(6);

        // Calcola la somma dei due numeri
        int somma = numeroUtente + numeroComputer;

        // Verifica se la somma è pari o dispari
        String risultato = (somma % 2 == 0) ? "pari" : "dispari";

        // Stampa i risultati
        System.out.println("Il computer ha scelto: " + ((sceltaUtente.equals("pari")) ? "dispari" : "pari"));
        System.out.println("Il computer ha generato il numero: " + numeroComputer);
        System.out.println("La somma dei due numeri è: " + somma);
        System.out.println("Il risultato è: " + risultato);

        // Determina il vincitore
        if (sceltaUtente.equals(risultato)) {
            System.out.println("Complimenti! Hai vinto!");
        } else {
            System.out.println("Mi dispiace, hai perso. Il computer vince!");
        }

        // Chiudi lo scanner
        scan.close();
    }
}


