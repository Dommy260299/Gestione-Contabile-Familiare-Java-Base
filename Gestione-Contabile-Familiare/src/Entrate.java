public class Entrate extends Movimento {
    String movimenti = "entrate";
    int importo;
    int entrateUscite;


    Entrate (String movimenti, int importo, int entrateUscite) {
        super(movimenti, importo, entrateUscite);
        this.movimenti = movimenti;
        this.importo = importo;
        this.entrateUscite = entrateUscite;
    }
    @Override
    void movimentiTotali() {
        System.out.println("Movimenti in Entrata Calcolati! "  );

    }
    @Override
    public int getValoreReale() {
        return importo + entrateUscite;

    }


}
