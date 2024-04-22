package classes;

public class MontagemCarcaca extends ProcessoOperacional {

    private static MontagemCarcaca montagemCarcaca = new MontagemCarcaca();

    private MontagemCarcaca() {};

    public static MontagemCarcaca getInstance() {
        return montagemCarcaca;
    }
    
}
