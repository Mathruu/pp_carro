package classes;

public class Cor implements Cloneable{
    
    private String cor;
    private String codigoCor;

    public Cor(String cor, String codigoCor) {
        super();
        this.cor = cor;
        this.codigoCor = codigoCor;
    }

    public String getCor() {
        return cor;
    }

    public String getCodigoCor() {
        return codigoCor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setCodigoCor(String codigoCor) {
        this.codigoCor = codigoCor;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Cor{" +
                "cor='" + cor + '\'' +
                ", codigoCor='" + codigoCor + '\'' +
                '}';
    }
}
