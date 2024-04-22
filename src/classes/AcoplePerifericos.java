package classes;

public class AcoplePerifericos extends ProcessoOperacional {

    private static AcoplePerifericos acoplePerifericos = new AcoplePerifericos();

    private AcoplePerifericos() {};

    public static AcoplePerifericos getInstance() {
        return acoplePerifericos;
    }
    
}
