package classes;

public class CarroFacade {
    
    public static boolean verificarPendencias (Carro carro) {
        if (MontagemCarcaca.getInstance().verificarCarroComPendência(carro)) {
            return false;
        }

        if (AcoplePerifericos.getInstance().verificarCarroComPendência(carro)) {
            return false;
        }

        return true;
    }
}
