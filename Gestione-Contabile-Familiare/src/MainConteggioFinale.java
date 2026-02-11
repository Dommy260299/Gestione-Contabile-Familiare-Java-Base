import java.util.Scanner;
public class MainConteggioFinale {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conteggio Movimenti PREMI X Per fare il Calcolo ");
        scanner.nextLine();
        System.out.println("Calcoliamo le entrate di Questo mese ");
        Entrate movEntrate = new Entrate("Entrate", 1600,200);
        System.out.println("Abbiamo " + movEntrate.importo + "$ di Stipendio + " + movEntrate.entrateUscite + "$ di un Bonifico a nostro Favore ");
        System.out.println("Risultato Entrate: " + movEntrate.getValoreReale());
        movEntrate.movimentiTotali();
        Uscite movUscite = new Uscite("Uscite", 500, 800);
        System.out.println("Abbiamo " + movUscite.mutuo + "$ di Mutuo + " + movUscite.bonificiInUscita + "$ di un Bonifico in Uscita ");
        System.out.println("Risultato uscite: " + movUscite.getValoreReale());
        movUscite.movimentiTotali();



    }
}
