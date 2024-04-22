package classes;

public class Carro implements Cloneable {
    
    private String tipo;
    private String modelo;
    private String marca;
    private Integer ano;
    private Cor cor;

    private Comprovante comprovante;
    private Validacao validacao;

    public Carro(String tipo, String modelo, String marca, Integer ano, Cor cor) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano; 
        this.cor = cor;
    }

    public Carro(FabricaAbstrata fabrica) {
        this.comprovante = fabrica.criarComprovante();
        this.validacao = fabrica.criarValidacao();
    }

    public String emitirComprovante () {
        return this.comprovante.emitir();
    }

    public String EmitirValidacao() {
        return this.validacao.validar();
    }

    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getAno() {
        return ano;
    }

    public Cor getCor() {
        return cor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    @Override
    public Carro clone() throws CloneNotSupportedException {
        Carro carroClone = (Carro) super.clone();
        carroClone.cor = (Cor) carroClone.cor.clone();
        return carroClone;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "tipo='" + tipo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", cor=" + cor +
                '}';
    }

    public boolean verificar() {
        return CarroFacade.verificarPendencias(this);
    }

}
