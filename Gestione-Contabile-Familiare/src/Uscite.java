public class Uscite extends Movimento {
    String movimenti = "uscite";
    int mutuo;
    int bonificiInUscita;



    Uscite (String movimenti, int mutuo, int bonificiInUscita) {
       super(movimenti,mutuo,bonificiInUscita);
        this.movimenti = movimenti;
       this.mutuo = mutuo;
       this.bonificiInUscita = bonificiInUscita;
    }
@Override
     void movimentiTotali() {
        System.out.println("Movimenti in uscita Calcolati!");
    }
    @Override
    public int getValoreReale() {
        return mutuo + bonificiInUscita;
    }
}