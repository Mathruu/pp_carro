package classes;

import java.util.ArrayList;
import java.util.List;

public abstract class ProcessoOperacional {
    
    private List<Carro> carroComPendência = new ArrayList<Carro>();

    public void adicionarCarroComPendência(Carro carro) {
        carroComPendência.add(carro);
    }

    public boolean verificarCarroComPendência(Carro carro) {
        return carroComPendência.contains(carro);
    }
}
