public class Movimento {
    String storicoMovimenti;
    int importo;
    int entrateUscite;

   Movimento(String storicoMovimenti, int importo, int entrateUscite) {
       this.storicoMovimenti = storicoMovimenti;
       this.importo = importo;
       this.entrateUscite = entrateUscite;


   }

   void movimentiTotali() {
       System.out.println("Calcolo Movimenti Totali ");

    }
    public int getValoreReale() {
        return  importo ;}
}
